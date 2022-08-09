package Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    List<Integer> list = new LinkedList<>();
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public List<Integer> findSeries(int n) {
        for(int i = 0; i <= n; i++) {
            list.add(fibonacci(i));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        Fibonacci fib = new Fibonacci();
        List<Integer> list = fib.findSeries(n);
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
