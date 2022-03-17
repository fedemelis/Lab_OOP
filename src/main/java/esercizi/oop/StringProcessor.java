package esercizi.oop;

import java.util.Arrays;
import java.lang.StringBuilder;

/**
 * Implementare una classe StringProcessor per effettuare operazioni su array di stringhe.
 * Metodi:
 *
 * public StringProcessor(String[] v): Costruttore
 * public int findShortest(): ritorna l'indice della stringa più corta
 * public int search(String key): ritorna l'indice dell'elemento key. -1 se non trovato.
 * public void reverse(): capovolge l'ordine delle stringhe
 * public boolean equals(Object obj)
 *
 * @author Nicola Bicocchi
 */
public class StringProcessor {
    String[] v;

    public StringProcessor(String[] v) {
        this.v = v;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }

    public int findShortest(){
        int bestIndex = 999;
        int ris = 0;
        for (int i = 0; i < getV().length; i++){
            if (getV()[i].length() < bestIndex){
                bestIndex = getV()[i].length();
                ris = i;
            }
        }
        return ris;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringProcessor that = (StringProcessor) o;
        return Arrays.equals(getV(), that.getV());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getV());
    }

    public int search(String key){
        int index = -1;
        for (int i = 0; i < getV().length; i++){
            if (getV()[i].equals(key)){
                index = i;
            }
        }
        return index;
    }

    public void reverse(){
        /*StringBuilder[] sb = new StringBuilder[v.length];
        for (int i = 0; i < v.length; i++){
            sb[i] = new StringBuilder("");
            sb[i].append(v[i]);
            sb[i].reverse();
            getV()[i] = sb[i].toString();
        }*/
        for (int i = 0; i < v.length / 2; i++) {
            String tmp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = tmp;
        }

    }
}
