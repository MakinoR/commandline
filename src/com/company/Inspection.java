package com.company;

import java.util.ArrayList;

public class Inspection {

    public void showArticle(ArrayList<Article> articleList) {
        int i = 1;
        for(Article article : articleList) {
            System.out.println(i + ":" + "タイトル: " + article.getTitle() + "\n" + "  内容: " + article.getContent());
            i++;
        }
    }
}
