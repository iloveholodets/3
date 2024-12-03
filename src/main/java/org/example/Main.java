package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final int TEST_SIZE = 100;

    public static void main(String[] args) {
        System.out.printf("%-20s %-10s %-10s %n", "Method", "Count", "Time (ns)");
        testListPerformance("ArrayList", new ArrayList<>());
        testListPerformance("LinkedList", new LinkedList<>());
    }

    private static void testListPerformance(String listType, List<Integer> list) {
        // Test add
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.printf("%-20s %-10d %d %n", listType + " add", TEST_SIZE, (endTime - startTime));

        // Test get
        startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.printf("%-20s %-10d %d %n", listType + " get", TEST_SIZE, (endTime - startTime));

        // Test remove
        startTime = System.nanoTime();
        for (int i = TEST_SIZE - 1; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        System.out.printf("%-20s %-10d %d %n", listType + " remove", TEST_SIZE, (endTime - startTime));
    }
}
