package ru.goluzov.se;

public interface Stack {
    void push(int i);
    void pop();
    int peek();
    boolean isEmpty();
    boolean isFull();

}