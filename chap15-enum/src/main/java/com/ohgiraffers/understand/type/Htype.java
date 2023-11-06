package main.java.com.ohgiraffers.understand.type;

public enum Htype {

    BulkUp(100,-40),
    loseWeight(70,-20),
    Diet(50,-10),
    Yoga(30,20),
    Ghost(30,0);

    int cash;
    int damage;

    Htype(int cash, int damage) {
        this.cash = cash;
        this.damage = damage;
    }



}
