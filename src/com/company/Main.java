package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //args→配列名、String[]→配列
        //標準入力を取得

        ArrayList<String> article = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        AirticleInspection art = new AirticleInspection();

        while (true) {

            System.out.println("行う操作を選択して「数字を」入力してください");
            System.out.print("1: 追加 ");
            System.out.print("2: 削除 ");
            System.out.print("3: 確認 ");
            System.out.println("4: 終了");

            int item = sc.nextInt();
            sc.nextLine();
            //改行文字が残るためここで空読みする→入れないと1でtitleに改行文字が入力されてしまう
            //2の場合は別の処理が先に来てるので改行があっても正常に動作する

//          int item = new Scanner(System.in).nextInt();

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

                System.out.println("");
                System.out.println("追加されました。記事の一覧を必ず確認してください");

//                art.inspection(article);
                System.out.println("");
                continue;
            }

            if (item == 2 && article.size() >0 ) {
                System.out.println("削除する記事を選んで番号を入力してください");
                art.inspection(article);

                int delete = sc.nextInt();
                article.remove(delete - 1);
                System.out.println("");
                System.out.println("削除されました。記事の一覧を必ず確認してください");

//                art.inspection(article);
                System.out.println("");
                continue;
            } else if (article.size() == 0) {
                System.out.println("記事がありません");
                System.out.println("");
                continue;
            }

            if (item == 3) {
                art.inspection(article);
                System.out.println("");
                continue;
            }
        }
    }
}


//課題
//複数追加、複数削除は可能？
//削除する記事、確認する記事がないとき
//拡張for文を使うには
//２の削除で指定されていない番号を入力した際の処理
//クラスを使って見やすくする
//終了はreturn でいいのか
//操作を中断する時はどうする？？