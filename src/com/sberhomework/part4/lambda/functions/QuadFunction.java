package com.sberhomework.part4.lambda.functions;

@FunctionalInterface
public interface QuadFunction<T, U, V, S, R> {
    R apply(T t, U u, V v, S s);
}
