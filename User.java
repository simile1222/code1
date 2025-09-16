package com.example.strategy;

public class User {
    private final String name;
    private final boolean subscriber; // 구독자 여부

    public User(String name, boolean subscriber) {
        this.name = name;
        this.subscriber = subscriber;
    }

    public String getName() { return name; }
    public boolean isSubscriber() { return subscriber; }

    // TODO(선택): boolean 대신 요금제 enum(예: FREE, SUBSCRIBER)으로 확장해 보세요.
}
