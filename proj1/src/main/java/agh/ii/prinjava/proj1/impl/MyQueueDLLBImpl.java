package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems= new DLinkList<>();

    // Add the element "x" to the start of the queue
    @Override
    public void enqueue(E x)
    {
        elems.addLast(x);
    }

    // Returns the first entered element of the queue which has been added
    @Override
    public E dequeue() {
        return elems.removeLast();
    }

    // Returns the number of elements in the queue
    @Override
    public int numOfElems() {
        return elems.getListSize();
    }

    // Indicates the next element that will be removed from the queue,
    // so the first element that was added (First In First Out)
    @Override
    public E peek() {
        return elems.getFoot();
    }
}
