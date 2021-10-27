package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> article = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        AirticleInspection art = new AirticleInspection();

        while (true) {

            System.out.println("行う操作を選択して「数字を」入力してください");
            System.out.println("1: 追加\n2: 削除\n3: 確認 \n4: 終了");

            int item = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            //改行文字が残るためここで空読みする→入れないと item = 1 でtitleに改行文字が入力されてしまう
            //item = 2の場合は別の処理が先に来てるので改行があっても正常に動作する

            if(item == 4){
                return;
            } else if (item > 4 || item <= 0 ){
                System.out.println("不正な入力です");
                return;
            }

            if (item == 1) {
                System.out.println("記事のタイトルを入力してください");
                String title = sc.nextLine();
                article.add(title);

                System.out.println("\n追加されました。\n");
//                continue;
//                条件分岐されているからcontinueがなくても動作する
            }

            if (item == 2 && article.size() >0 ) {
                System.out.println("削除する記事を選んで番号を入力してください");
                art.inspection(article);

                int delete = sc.nextInt();
                article.remove(delete - 1);
                System.out.println("\n削除されました。記事の一覧を確認してください\n");

//                continue;
            } else if (article.size() == 0) {
                System.out.println("記事がありません\n");
//                continue;
            }

            if (item == 3) {
                art.inspection(article);
                System.out.println("");
//                continue;
            }
        }
    }
}

//複数追加、複数削除は可能？
//削除する記事、確認する記事がないとき
//拡張for文を使うには
//２の削除で指定されていない番号を入力した際の処理
//クラスを使って見やすくする
//終了はreturn でいいのか
//操作を中断する時はどうする？？