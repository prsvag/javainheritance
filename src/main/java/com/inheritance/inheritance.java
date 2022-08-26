package com.inheritance;

public class inheritance {
    public static void main(String[] args) {
        schoolBag sch = new schoolBag();
        sch.Pencil();
        sch.Book();
        sch.eraser();
        sch.tiffinBox();
        sch.numberOfbag();

        System.out.println("Polymorphism ");

        blackBoard blc = new blackBoard();
        blc.numberOfduster();
        blc.whitePen();
    }
}
