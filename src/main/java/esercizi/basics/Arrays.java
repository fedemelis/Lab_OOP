package esercizi.basics;

/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/array/index.php
 *
 * Preferences -> Editor -> General -> Code folding -> One-line methods (uncheck)
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Arrays {
    /**
     * Write a function accepting a double[] and a factor f (double)
     * returning a double[] representing the original double[] divided by f
     */
    public static double[] divideArrayP(double[] in, double f) {
        double[] out = new double[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] / f;
        }
        return out;
    }
    public static double[] divideArray(double[] in, double f){
        for(int i = 0; i < in.length; i++){
            in[i] = in[i] / f;
        }
        return in;
    }


    /**
     * Write a function accepting two double[]
     * returning a double[] representing the first array divided by the second array
     * The two arrays must have the same size. Returns null otherwise.
     */
    public static double[] divideArraysP(double[] a, double[] b) {
        if (a.length != b.length)
            return null;
        double[] out = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = a[i] / b[i];
        }
        return out;
    }
    public static double[] divideArrays(double[] a, double[] b){

        if (a.length != b.length){
            return null;
        }

        for (int i = 0; i < a.length; i++ ){
            a[i] /= b[i];
        }
        return a;
    }

    /**
     * Write a function accepting an int[]
     * returning a sorted version of it (bubble sort)
     */
    public static int[] bubbleSortP(int[] v) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    changed = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
        return v;
    }
    public static int[] bubbleSort(int[] v){
       int dim = v.length - 1;

        for (int i = 0; i < v.length; i++){
            for (int ii = 0; ii < dim; ii++){
                if (v[ii] > v[ii + 1]){
                    int tmp = v[ii];
                    v[ii] = v[ii + 1];
                    v[ii + 1] = tmp;
                }
            }
            dim -= 1;
        }

        return v;
    }

    /**
     * Write a function accepting an int
     * returning a long[] composed of the first n numbers of the Fibonacci series (without recursion).
     */
    public static long[] fibonacciP(int n) {
        long[] fibonacci;
        if (n == 1) {
            fibonacci = new long[]{0};
        } else if (n == 2) {
            fibonacci = new long[]{0, 1};
        } else {
            fibonacci = new long[n];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }
    public static long[] fibonacci(int n){
        long[] l = new long[n];
        if (n == 1){
            l[0] = 0;
        }
        else if (n == 2){
            l[0] = 0;
            l[1] = 1;
        }
        else{
            l[0] = 0;
            l[1] = 1;
            for (int i = 2; i < n; i++){
                l[i] = l[i-1] + l[i-2];
            }
        }
        return l;
    }

    /**
     * Write a function accepting an int[]
     * returning an int[] in which all the 0s have been moved to the end of an array.
     * Maintain the relative order of the other (non-zero) elements.
     */
    public static int[] moveZerosEndP(int[] v) {
        int[] output = new int[v.length];
        int i, j = 0;
        for (i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                output[j++] = v[i];
            }
        }
        // fills with remaining zeros
        for (; j < output.length; j++) {
            output[j] = 0;
        }
        return output;
    }
    public static int[] moveZerosEnd(int[] v){

        for (int i = 0; i < v.length; i++){
            if (v[i] == 0){
                for (int ii = i; ii < v.length - 1; ii++){
                    v[ii] = v[ii+1];
                }
                v[v.length - 1] = 0;
            }
        }
        return v;

    }

    /**
     * Write a function accepting an int
     * returning the sequence of individual digits.
     * (e.g. 363738229 -> [3,6,3,7,3,8,2,2,9])
     */
    public static int[] splitterP(int input) {
        int n = Integer.toString(input).length();
        int[] digits = new int[n];
        for (int d = n - 1; d >= 0; d--) {
            digits[digits.length - 1 - d] = input / ((int) Math.pow(10, d)) % 10;
        }
        return digits;
    }
    public static int[] splitter(int input){
        int i = 0;
        int realInput = input;

        while (input > 0) {
            input /= 10;
            i += 1;
        }

        int []ris = new int[i];
        i -= 1;

        while (realInput > 0) {
            ris[i] = realInput % 10;
            realInput /= 10;
            i -= 1;
        }
        return ris;
    }
}