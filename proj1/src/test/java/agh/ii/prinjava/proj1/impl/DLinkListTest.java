package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest<E> {

    DLinkList<E> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // test if after adding a new node at the beginning, the size of the list is 1
    @Test
    void addFirst() {
        // if
        E data = null;
        dLinkList.addFirst(data);
        // then
        assertEquals(1,dLinkList.getListSize());
    }

    // test if after adding a new node at the end, the size of the list is 1
    @Test
    void addLast() {
        // if
        E data = null;
        dLinkList.addLast(data);
        // then
        assertEquals(1,dLinkList.getListSize());
    }

    // test if after adding a new node at the beginning, the size of the list is 1, and after removing it, the size of the list is 0
    @Test
    void removeFirst() {
        // if
        E data = null;
        dLinkList.addFirst(data);
        // then
        assertEquals(1,dLinkList.getListSize());
        // if
        dLinkList.removeFirst();
        // then
        assertEquals(0,dLinkList.getListSize());
    }

    // test if after adding a new node at the end, the size of the list is 1, and after removing it, the size of the list is 0
    @Test
    void removeLast() {
        // if
        E data = null;
        dLinkList.addFirst(data);
        // then
        assertEquals(1,dLinkList.getListSize());
        // if
        dLinkList.removeLast();
        // then
        assertEquals(0,dLinkList.getListSize());
    }
}