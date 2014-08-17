package com.github.alica032.bag_stack_queue;
import java.util.Iterator;

public class LinkedQueue<Item> implements Iterable<Item> {
    private Node first, last;

    private class Node{
        Item item;
        Node next;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public void add(Item x){
        Node oldlast = last;
        last = new Node();
        last.item = x;
        last.next = null;
        if(isEmpty()) first = last;
        else oldlast.next = last;
    }

    public Item dequeue(){
        if(isEmpty()) return null;
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        return item;
    }
}
