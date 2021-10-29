package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inspection inspection = new Inspection();
        ArrayList<Article> articleList = new ArrayList<>();
//        var articleList = new ArrayList<Article>();

        while (true) {
            System.out.println("行う操作を選択して「数字を」入力してください");
            System.out.println("1: 追加\n2: 削除\n3: 確認\n4: 終了");

            int operation = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            if (operation == Operation.QUIT.getId()) {
                return;
            }

            if (operation == Operation.ADD.getId()) {
                System.out.println("記事のタイトルを入力してください");
                String title = sc.nextLine();
                System.out.println("記事の内容を入力してください");
                String content = sc.nextLine();
                Article add = new Article(title, content);
                articleList.add(add);

                System.out.println("\n追加されました。\n");
//                continue;
            }

            if (operation == Operation.DELETE.getId() && articleList.size() > 0) {
                System.out.println("削除する記事を選んで番号を入力してください");
                inspection.showArticle(articleList);

                int delete = sc.nextInt();
                articleList.remove(delete - 1);
                System.out.println("\n削除されました。記事の一覧を確認してください\n");
//                continue;
            } else if (articleList.size() == 0) {
                System.out.println("記事がありません\n");
//                continue;
            }

            if (operation == Operation.CONFIRM.getId()) {
                inspection.showArticle(articleList);
                System.out.println("");
//                continue;
            }
        }
    }
}

//複数追加、複数削除は可能？
//削除する記事、確認する記事がないとき
//２の削除で指定されていない番号を入力した際の処理
//クラスを使って見やすくする
//終了はreturn でいいのか
//操作を中断する時はどうする？？