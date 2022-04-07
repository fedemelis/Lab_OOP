package test;

import esercizi.basics.MyArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Prove {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint();

        p1.x = 1;
        p1.y = 2;

        p2.x = 10;
        p2.y = 20;


        MyPoint.swap(p1);
        MyPoint.swap(p2);

        int[] p = {1, 2, 3};

        MyArrays.moveZerosEnd(p);

        List<List<String>> l = new ArrayList<List<String>>();
        List<String> l1 = new ArrayList<String>();
        l.add(l1);

    }
}
