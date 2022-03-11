package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {
    // Add the element "x" to the start of the queue
    void enqueue(E x);

    // Returns the the first element of the queue which has been added
    E dequeue();

    // check if the stack contains no elements
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    // Returns the number of elements in the queue
    int numOfElems();

    // Indicates the next element that will be removed from the queue,
    // so the first element that was added (First In First Out)
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
