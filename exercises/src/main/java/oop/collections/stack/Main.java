package oop.collections.stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> integerMyStack = new MyStack<>();

        System.out.println(integerMyStack);

        integerMyStack.push(23);
        integerMyStack.push(24);
        integerMyStack.push(44);
        integerMyStack.push(69);

        System.out.println(integerMyStack);

    }
}
