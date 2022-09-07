package decrement;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(34);
        n.add(265);
        n.add(42);
        n.add(75);
        n.add(322);

        System.out.println(n);
       // n.sort(Comparator.naturalOrder());

        Collections.sort(n);
        System.out.println(n);
        int min = n.get(0);
       System.out.println(min);

       int highestindex = n.size()-1;
        int max =n.get(highestindex);
       System.out.println(max);




    }
}








