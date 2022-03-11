package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    // Returns the the upper element of the stack which has been added
    @Override
    public E pop() {
       return elems.removeFirst();
    }

    // Add the element "x" to the top of the stack
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    // Returns the number of elements in the stack
    @Override
    public int numOfElems() {
        return elems.getListSize();
    }

    // Indicates the next element that will be removed from the stack,
    // so the last element that was added (Last In First Out)
    @Override
    public E peek() {
        return elems.getHead();
    }
}
