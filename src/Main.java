import algorithms.searching.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(Search.linearSearch(list, 5));
        System.out.println(Search.binarySearch(list, 5));
    }
}