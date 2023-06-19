package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);
        int f1 = calculateFunctionValue(x1);
        int f2 = calculateFunctionValue(x2);
        if (f1 != f2) {
            return Integer.compare(f1, f2);
        } else {
            return Integer.compare(x1, x2);
        }
    }

    private int calculateFunctionValue(int x) {
        return 5 * x * x + 3;
    }
}

