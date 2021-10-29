package com.company;

public enum Operation {

    ADD(1),
    DELETE(2),
    CONFIRM(3),
    QUIT(4);

    private final int id;

    Operation(int id){ //自動的にprivate になる
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
}


