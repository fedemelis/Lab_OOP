package test;

public class MyPoint {
    /*
    *
    * coordinate di un punto x e y
    *
    * */

    int x;
    int y;

    /*
    *
    * posso creare un punto vuoto
    * posso creare un punto a partire da due coordinate
    * posso creare un punto a partire da un altro punto
    *
    * */

    public MyPoint() {

    }

    public MyPoint(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public MyPoint(MyPoint pp) {
        x = pp.x;
        y = pp.y;
    }

    /*
    *
    * swap di x e y
    *
    * */

    public static void swap(MyPoint pp){
        int tmp = pp.x;
        pp.x = pp.y;
        pp.y = tmp;
    }

    /*
    *
    * non funziona
    *
    * */
    public static void changePoint(MyPoint p1, MyPoint p2){
        p1 = p2;
    }

}
