package oop.collections.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStack<T> {

    private Object[] stack;
    private int size;

    public MyStack() {
        stack = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void push(T element) {
        if (size == stack.length) {
            stack = Arrays.copyOf(stack, stack.length * 2);
        }

        stack[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        @SuppressWarnings("unchecked")
        T element = (T) stack[--size];

        stack[size] = null;

        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "Empty stack";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== Stack ===\n");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(String.format("%d - %s\n", i, stack[i]));
        }

        return sb.toString();
    }
}
