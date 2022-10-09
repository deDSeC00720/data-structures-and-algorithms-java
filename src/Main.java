import algorithms.sorting.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Before sorting:");
        System.out.println(arrayList);

        Sort.selectionSort(arrayList);

        System.out.println("After sorting:");
        System.out.println(arrayList);
    }
}