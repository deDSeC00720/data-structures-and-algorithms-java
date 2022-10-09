package algorithms.searching;

import java.util.Collections;
import java.util.List;

public class Search {
    public static int linearSearch(List<Integer> list, int item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == item) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(List<Integer> list, int item) {
        for (int start = 0, end = list.size() - 1; start <= end; ) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) == item) {
                return mid;
            }
            if (list.get(mid) > item) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
