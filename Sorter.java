package com.example.strategy;

import java.util.Arrays;

public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 사용자에 맞는 전략을 자동 선택해 설정.
     */
    public void chooseStrategy(User user) {
        // TODO: StrategyFactory 사용해서 전략 주입
        // this.strategy = StrategyFactory.fromUser(user);
        StrategyFactory strategyFactory = new StrategyFactory();
        strategy = strategyFactory.fromUser(user);
    }

    public int[] sortArray(int[] numbers) {
        if (strategy == null) {
            throw new IllegalStateException("정렬 전략이 설정되지 않았습니다.");
        }
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        strategy.sort(copy);
        return copy;
    }
}