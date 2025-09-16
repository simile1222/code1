package com.example.strategy;

public class StrategyFactory {

    private StrategyFactory() {}

    /**
     * 요구사항:
     *  - 구독자(subscriber=true)  -> QuickSort 무료 제공
     *  - 무료 사용자(subscriber=false) -> BubbleSort 사용
     */
    public static SortStrategy fromUser(User user) {
        // TODO: 위 정책에 따라 적절한 전략 인스턴스 반환
        // 예: return user.isSubscriber() ? new QuickSort() : new BubbleSort();
        throw new UnsupportedOperationException("TODO: StrategyFactory.fromUser 구현");
    }
}
