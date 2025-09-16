package com.example.strategy;

import java.util.Arrays;

public class StrategyPatternApp {
    public static void main(String[] args) {
        User freeUser = new User("Alice", false);
        User subscriber = new User("Bob", true);

        Sorter sorter = new Sorter();

        int[] a = {5, 2, 9, 1, 5, 6};
        int[] b = {3, 7, 8, 5, 2, 1};

        // 무료 사용자 → BubbleSort (정책)
        // TODO: chooseStrategy 구현 후 주석 해제
        // sorter.chooseStrategy(freeUser);
        // System.out.println("사용 전략: " + sorterStrategyName(sorter));
        // System.out.println("정렬 결과: " + Arrays.toString(sorter.sortArray(a)));

        // 구독자 → QuickSort (정책)
        // sorter.chooseStrategy(subscriber);
        // System.out.println("사용 전략: " + sorterStrategyName(sorter));
        // System.out.println("정렬 결과: " + Arrays.toString(sorter.sortArray(b)));
    }

    // 편의 메서드(선택)
    // private static String sorterStrategyName(Sorter sorter) { ... }
}
