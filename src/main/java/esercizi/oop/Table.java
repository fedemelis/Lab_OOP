package esercizi.oop;

/**
 * Scrivere una classe Table per rappresentare tavole pitagoriche.
 * Metodi:
 *
 * Table()      costruttore senza parametri che configura una tavola 10x10
 * Table(a, b)  costruttore che configura una tavola axb
 * toString()   ritorna una stringa che rappresenta la tavola
 * double sum() ritorna la somma di tutti i numeri presenti nella tavola
 * double avg() ritorna la media di tutti i numeri presenti nella tavola
 */
public class Table {
    int a, b;

    public Table(){
        a = 10;
        b = 10;
    }

    public Table(int a, int b){
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double sum(){
        double sum = 0;
        for (int i = 1; i <= getA(); i++){
            for (int ii = 1; ii <= getB(); ii++){
                sum += (i * ii);
            }
        }
        return sum;
    }

    public double avg(){
        double avg = 0;
        for (int i = 1; i <= getA(); i++){
            for (int ii = 1; ii <= getB(); ii++){
                avg += (i * ii);
            }
        }
        return avg / (getA() * getB());
    }
}
