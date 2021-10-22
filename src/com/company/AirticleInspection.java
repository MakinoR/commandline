package com.company;

import java.util.ArrayList;

public class AirticleInspection {

    public void inspection (ArrayList<String> article){
        for (int i = 0; i < article.size(); i++) {
            System.out.println((i + 1) + ":" + article.get(i));
        }
    }

//    public void newLine (){
//        System.out.println("");
//    }

}
