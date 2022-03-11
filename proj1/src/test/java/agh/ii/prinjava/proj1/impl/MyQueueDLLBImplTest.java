package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest<E> {
    MyQueue<E> queueOfE = MyQueue.create();

    @BeforeEach
    void setUp() {
        System.out.println("Start of test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of test");
    }

    // after enqueuing 3 elements, we are testing if it has been correctly added
    @Test
    void enqueue() {
        // if
        E obj1 = null;
        queueOfE.enqueue(obj1);

        // then
        assertEquals(obj1, queueOfE.peek());
    }

    // after enqueuing 3 elements, we are testing if the dequeued one is the one which is expected
    @Test
    void dequeue() {
        // if
        E obj1 = null;
        E obj2 = null;
        E obj3 = null;
        queueOfE.enqueue(obj1);
        queueOfE.enqueue(obj2);
        queueOfE.enqueue(obj3);

        // then
        assertEquals(obj1, queueOfE.dequeue());
    }

    // we enqueue several elements and check if the number of elements is correct
    @Test
    void numOfElems() {
        // if
        E obj1 = null;
        E obj2 = null;
        queueOfE.enqueue(obj1);
        queueOfE.enqueue(obj1);
        queueOfE.enqueue(obj1);
        queueOfE.enqueue(obj2);

        // then
        assertEquals(4,queueOfE.numOfElems());
    }

    // after enqueuing two element, we are testing if the peeked element is the correct one
    @Test
    void peek() {
        // if
        E obj1 = null;
        E obj2 = null;
        queueOfE.enqueue(obj1);
        queueOfE.enqueue(obj2);

        // else
        assertEquals(obj1, queueOfE.peek());
    }
}