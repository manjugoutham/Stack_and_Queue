package stacklinkedlist;

import java.util.LinkedList;

public class Stack {
	
	LinkedList<Integer> list = new LinkedList<>();

    public void push(int data) {
    	list.addFirst(data);
    }

    public void peak() {
        System.out.println("Peak value: "+list.peek());
    }

    public void pop() {
        if(list.size() != 0) {
        	list.pop();
        }else {
            System.out.println("Stack id empty");
            return;
        }
    }

    public void print() {
        for (Integer integer : list) 
        {
            System.out.println(" "+integer);
        }
    }

}
