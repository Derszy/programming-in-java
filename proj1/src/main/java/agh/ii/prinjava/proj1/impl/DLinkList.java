package agh.ii.prinjava.proj1.impl;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class DLinkList<E> {

    private ArrayList<Node> list = new ArrayList<>();
    private Node head = null;
    private Node foot = null;

    public void addFirst(E data) {
        Node node = new Node(data);
        Node current;

        // if the list is empty we just add the new element
        if(list.isEmpty()) {
            // updating the new foot
            foot = node;
        }
        // if the list isn't empty we can get the first element
        else {
            current = head;

            // changing the new element's next node
            node.setNext(current);
            // changing the current element previous node
            current.setPrev(node);
        }

        // adding the new node
        list.add(node);
        // updating the new head
        head = node;
    }

    public void addLast(E data) {
        Node node = new Node(data);
        Node current;

        // if the list is empty we just add the new element
        if(list.isEmpty()) {
            // updating the new foot
            head = node;
        }
        // if the list isn't empty we can get the last element
        else {
            current = head;

            // search for the last element
            while(current.next != null)
                current = current.next;

            // changing the new element's previous node
            node.setPrev(current);
            // changing the current element's next node
            current.setNext(node);
        }

        // adding the new node
        list.add(node);
        // updating the new foot
        foot = node;
    }

    public E removeFirst() {
        Node current;
        Node stock = new Node();

        // if the list isn't empty we can remove the first element
        if(!list.isEmpty()) {
            current = head;

            if(current.next != null)
                current = current.next;

            current.prev = null;

            // remove the first element
            stock = head;
            list.remove(head);

            // updating the new head
            head = current;
        }
        return (E) stock.elem;
    }

    public E removeLast() {
        Node current;
        Node stock = new Node();

        // if the list isn't empty we can remove the last element
        if(!list.isEmpty()) {
            current = foot;

            if(current.prev != null)
                current = current.prev;

            // remove the last element
            stock = head;
            list.remove(foot);

            current.next = null;

            // updating the new foot
            foot = current;
        }
        return (E) stock.elem;
    }

    @Override
    public String toString() {
        return "DLinkList{" +
                "list=" + list +
                '}';
    }

    // returns the list's size
    public int getListSize() {
        return list.size();
    }

    // returns the foot of the list
    public E getFoot() {
        return (E) foot.elem;
    }

    // returns the head of the list
    public E getHead() {
        return (E) head.elem;
    }

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;


        // default constructor
        public Node() {

        }

        // constructor to set the data
        public Node(T elem) {
            this.elem = elem;
        }

        // constructor to set previous and next node
        public Node(Node<T> prev, Node<T> next) {
            this.prev = prev;
            this.next = next;
        }

        // constructor to set previous and next node and the data
        public Node(Node<T> prev, Node<T> next, T elem) {
            this.prev = prev;
            this.next = next;
            this.elem = elem;
        }

        // method to set the previous node
        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        // method to set the next node
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
