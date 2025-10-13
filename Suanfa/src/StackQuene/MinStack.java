package StackQuene;

import java.util.Stack;

/**
 * ClassName:MinStack
 * Description:
 */
public class MinStack {
            Stack<Integer> stack ;
            Stack<Integer> minStack;
    public MinStack() {
         stack = new Stack<>();
         minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }else {
            minStack.push(stack.peek());
        }
    }

    public void pop() {
            stack.pop();
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
            return minStack.peek();
    }
}
