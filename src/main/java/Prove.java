
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

        Arrays.moveZerosEnd(p);

    }
}
