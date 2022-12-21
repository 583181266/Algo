package com.yisuo.test.demo1;

import java.util.concurrent.locks.Condition;

/**
 * @author huangbentai
 * @date 2022/12/13 12:08
 */
public class ThreadUnsafeExample {

    private int count = 0;

    public void add(){
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
