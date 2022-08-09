package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Generics {

    //Lower bound generics
    public static void addElements(List<Integer> list, int... elements) {
        for (int element : elements) {
            list.add(element);
        }
    }

    //Upper bound generics
    public static double sumOfElements(List<? extends Number> list) {
        double sum = 0;
        for (Number element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String args[]) {
        List list = new ArrayList<Number>();
        addElements(list, 1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println(sumOfElements(list));
    }
}
