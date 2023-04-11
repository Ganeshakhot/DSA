package StackAndQueue;

import java.util.Stack;

//  when to use Stack
// Ans if you see the problem elements we have to set in a perticular manar then use Stack
public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val){
        stack1.add(val);
    }

    public int dequeue(){
        if (stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int remove = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return remove;
    }

    public int peek(){
        if (stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peeked = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peeked;
    }

    public void Print(){
        System.out.println(stack1);
    }


    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.Print();

        q.dequeue();

        q.Print();
    }
}
