package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest<E> {
    MyStack<E> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        System.out.println("Beginning of the test !");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of the test  !");
    }

    // we push an element and check if it is corrctly popped
    @Test
    void pop() {
        // if
        E object1 = null;
        stackOfInts.push(object1);

        // then
        assertEquals(object1,stackOfInts.pop());
    }

    // we push an element and check if it has been added
    @Test
    void push() {
        // if
        E object2 = null;
        stackOfInts.push(object2);

        // then
        assertEquals(1,stackOfInts.numOfElems());
    }

    // we push several elements and check if they are corrctly counted
    @Test
    void numOfElems() {
        // if
        E object3 = null;
        stackOfInts.push(object3);
        stackOfInts.push(object3);
        stackOfInts.push(object3);

        // then
        assertEquals(3,stackOfInts.numOfElems());
    }

    // we push 2 elements and watch if the peeked one is the correct one
    @Test
    void peek() {
        // if
        E object4 = null;
        E object5 = null;
        stackOfInts.push(object4);
        stackOfInts.push(object5);

        // then
        assertEquals(object5,stackOfInts.peek());
    }
}