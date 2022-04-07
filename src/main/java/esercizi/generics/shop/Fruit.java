package esercizi.generics.shop;

public class Fruit extends Product {

    /*public Fruit() {
        super();
        description = "A fruit";
    }*/

    public Fruit() {
        super(); //chiamo il costruttore padre per eventuali operazioni
        desc = "fruit desc";
    }
}
