package com.example.strategy;

public interface SortStrategy {
    /**
     * numbers 배열을 "제자리(in-place)" 정렬하세요.
     */
    void sort(int[] numbers);

    default String name() {
        return getClass().getSimpleName();
    }
}
