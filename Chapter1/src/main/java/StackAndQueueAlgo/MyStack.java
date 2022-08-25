package StackAndQueueAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue1;

    public MyStack() {
        //LinkedList是双端队列
        this.queue1 = new LinkedList<>();

    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        int size = queue1.size();
        for (int i = 0; i < size - 1; i++) {
            queue1.add(queue1.poll());
        }
        return queue1.poll();
    }

    public int top() {
        int size = queue1.size();
        for (int i = 0; i < size - 1; i++) {
            queue1.add(queue1.poll());
        }
        Integer peek = queue1.peek();
        queue1.add(queue1.poll());
        return peek;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
