package esercizi.oop;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * Write a class named Vector representing a vector of integers with additional features.
 *
 * Supported methods:
 * void init() initialize the vector with random numbers [0, 100]
 * void sort() sorts the vector in ascending order
 * void show() shows the content of the vector
 * int search(int value) returns the index in which "value" is stored. -1 if "value" is missing.
 *
 * @author Nicola Bicocchi
 */
public class Vector {
    int[] v;

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public Vector(int[] v) {
        this.v = v;
    }

    public void init(){
        Random rnd = new Random();
        for (int i = 0; i < getV().length; i++){
            getV()[i] = rnd.nextInt(0, 100);
        }
    }

    public void sort(){
        int dim = getV().length - 1;
        for (int ii = 0; ii < getV().length; ii++){
            for (int i = 0; i < dim; i++){
                if (getV()[i] > getV()[i + 1]){
                    int tmp = getV()[i];
                    getV()[i] = getV()[i + 1];
                    getV()[i + 1] = tmp;
                }
            }
            dim -= 1;
        }
    }

    public void show(){
        for (int i = 0; i < getV().length; i++){
            System.out.println(getV()[i]);
        }
    }

    public int search(int index){
        for (int i = 0; i < getV().length; i++){
            if (getV()[i] == index){
                return i;
            }
        }
        return -1;
    }
}
