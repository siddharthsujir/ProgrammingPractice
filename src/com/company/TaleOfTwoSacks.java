package com.company;

import java.util.Stack;

public class TaleOfTwoSacks {

    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();
// 14 28 60 78
        public void enqueue(T value) { // Push onto newest stack

            while(!stackNewestOnTop.empty())
            {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
                stackNewestOnTop.push(value);

            while(!stackOldestOnTop.empty())
            {
                stackNewestOnTop.push(stackOldestOnTop.pop());
            }

        }

        public T peek() {


            return stackNewestOnTop.peek();
        }

        public T dequeue() {

            return stackNewestOnTop.pop();
        }
    }

}


