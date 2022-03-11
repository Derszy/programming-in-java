package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {
    // Returns the the upper element of the stack which has been added
    E pop();

    // Add the element "x" to the top of the stack
    void push(E x);

    // check if the stack contains no elements
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    // Returns the number of elements in the stack
    int numOfElems();

    // Indicates the next element that will be removed from the stack,
    // so the last element that was added (Last In First Out)
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
