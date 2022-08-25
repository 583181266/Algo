package StackAndQueueAlgo;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;


    public MyQueue() {
        this.stackIn = new Stack<>();
        this.stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);

    }

    public int pop() {
        stackIntoStackOut();
        return stackOut.pop();
    }

    private void stackIntoStackOut() {
        if (stackOut.empty()){
            while (!stackIn.empty()){
                stackOut.push(stackIn.pop());
            }
        }
    }

    public int peek() {
        stackIntoStackOut();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackOut.empty() && stackIn.empty();

    }
}
