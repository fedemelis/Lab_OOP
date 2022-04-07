package esercizi.generics.shop;

import java.util.*;

/**
 * A shop capable of buying and selling generic stuff
 *
 * @author Nicola Bicocchi
 */
/*public class Shop<T> {
    final Queue<T> items;

    public Shop() {
        // a queue implementing a FIFO policy
        items = new LinkedList<>();
    }

    public void buy(T item) {
        items.add(item);
    }

    public T sell() {
        return items.poll();
    }

    public void buy(Collection<? extends T> cart) {
        items.addAll(cart);
    }

    public void sell(Collection<? super T> cart, int n) {
        for (int i = 0; i < n; i++) {
            cart.add(items.poll());
        }
    }

    public Collection getItems() {
        return items;
    }
}*/

public class Shop <T>{
    Queue<T> items;

    public Shop() {
        items = new LinkedList<>();
    }

    public T sell(){
        return items.poll();
    }

    public Collection getItems(){
        return items;
    }

    public void sell(Collection<? super T> c, int n){
        for(int i = 0; i < n; i++){
            c.add(items.poll());
        }
    }

    public void buy(T i){
        items.add(i);
    }

    public void buy(Collection<? extends T> c){
        items.addAll(c);
    }


}
