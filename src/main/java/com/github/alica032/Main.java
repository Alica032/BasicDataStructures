package com.github.alica032;
import com.github.alica032.bag_stack_queue.LinkedQueue;

public class Main {
    public static void main(String[] args){
        LinkedQueue<String> bag= new LinkedQueue<String>();
        bag.add("ret");
        bag.add("tyu");
        for (String s: bag){
            System.out.println(s);
        }
        System.out.println(bag.dequeue());
        System.out.println(bag.dequeue());
        System.out.println(bag.dequeue());
    }
}