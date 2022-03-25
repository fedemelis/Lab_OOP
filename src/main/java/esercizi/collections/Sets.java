package esercizi.collections;

import java.util.*;
/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/collection/index.php
 *
 * Preferences -> Editor -> General -> Code folding -> One-line methods (uncheck)
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Sets {
    /**
     * Write a function returning the intersection of two given sets (without using library functions)
     */
    public static Set<Integer> intersection_manual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ris = new HashSet<>();
        for (int f : first){
            for (int s : second){
                if (f == s){
                    ris.add(f);
                }
            }
        }
        return ris;
    }

    /**
     * Write a function returning the union of two given sets (without using library functions)
     */
    public static Set<Integer> union_manual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ris = new HashSet<>(first);
        ris.addAll(second);
        return ris;
    }

    /**
     * Write a function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ris = new HashSet<>(first);
        ris.retainAll(second);
        return ris;
    }


    /**
     * Write a function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ris = new HashSet<>();
        ris.addAll(first);
        ris.addAll(second);
        return ris;
    }

    /**
     * Write a function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /**
     * Write a function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> l) {
        Set<Integer> tmp = new HashSet<>(l);
        List<Integer> ris = new ArrayList<>(tmp);
        return ris;

    }

    /**
     * Write a function to remove duplicates from a list without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicates_manual(List<Integer> l) {
        List<Integer> ris = new ArrayList<>();
        boolean isDup = false;
        for(Integer i: l){
            isDup = false;
            for (int r : ris){
                if (i == r){
                    isDup = true;
                }
            }
            if (!isDup){
                ris.add(i);
            }
        }
        return ris;
    }

    /**
     * Write a function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {

        Set<Character> str = new HashSet<>();
        for (char c : s.toCharArray()){
            if (!str.contains(c)){
                str.add(c);
            }
            else{
                String tmp = new String(Character.toString(c));
                return tmp;
            }
        }
        return "";
    }

    /**
     * Write a function accepting a string s, and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> str = new HashSet<>();
        Set<Character> ris = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!str.contains(c)) {
                str.add(c);
            } else if (!ris.contains(c)) {
                ris.add(c);
            }
        }
        return ris;
    }

    /**
     * Write a function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[source.size()]);
    }

    /**
     * Write a function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /**
     * Write a function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /**
     * Write a function to get an element from a TreeSet which is strictly greater than a given element.
     * Note well: use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}