package Arrays;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The maximum element of the array is: " + findMaxRecursive(arr, n));
    }
    public static int findMaxRecursive(int[] arr, int n) {
        if(n == 1)
            return arr[0];
        else
            return Math.max(arr[n-1], findMaxRecursive(arr, n-1));
    }
}
