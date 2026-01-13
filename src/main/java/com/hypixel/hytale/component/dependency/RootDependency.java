package com.hypixel.hytale.component.dependency;

public class RootDependency {
    public static <T> Dependency<T> first() {
        return new Dependency<>();
    }
}
