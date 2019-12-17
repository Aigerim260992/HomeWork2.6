package com.company;

public class Main {

    public static void main(String[] args) {

        Appartment<Integer, Integer> app = new Appartment<>(1, 2);
        Appartment<Integer, Integer> app2 = new Appartment<>(3, 4);
        app.print();
        app2.print2();

    }



}
