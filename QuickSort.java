package com.example.strategy;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        // TODO: 퀵 정렬(분할정복) 구현
        // 1) partition 피벗 기준 분할
        // 2) 좌/우 부분 배열 재귀 정렬
        // 피벗 선택은 고정(끝 원소) 또는 중간값 등 자유
        throw new UnsupportedOperationException("TODO: QuickSort.sort 구현");
    }

    // TODO(선택): 필요하면 아래 헬퍼를 추가하세요.
    // private void quick(int[] a, int lo, int hi) { ... }
    // private int partition(int[] a, int lo, int hi) { ... }
    // private void swap(int[] a, int i, int j) { ... }
}
