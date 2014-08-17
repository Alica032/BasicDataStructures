package com.github.alica032.bag_stack_queue;
import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Item[]s;
    private int N;
    public Bag(){
        N = 1;
        s = (Item[])new Object[N];
    }

    private class BagIterator implements Iterator<Item>{
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return s[--i];
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    public int size(){
        return N;
    }

    private void resize(int capacity){
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < N; i++)
            copy[i] = s[i];
        s = copy;
    }

    public void add(Item item){
        if(N == s.length) resize(2 * s.length);
        s[N++] = item;
    }
}
