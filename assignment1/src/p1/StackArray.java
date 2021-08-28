package p1;

import java.util.Scanner;

public class StackArray implements StackIntf {
	
	    int size;
	    int arr[];
	    int top;
	 
	    public StackArray(int size) {
	        this.size = size;
	        this.arr = new int[size];
	        this.top = -1;
	    }
	 
	   
	    public void show()
	    {
	    	for(int s : arr)
	    		System.out.println(s + " ");
	    }

	    @Override
		public boolean IsEmpty() {
			return (top == -1);
		}

		@Override
		public boolean IsFull() {
			return (size - 1 == top);
		}

	@Override
	public void Push(int elem) {
		  if (!IsFull()) {
	           ++top;
	            arr[top] = elem;
	        } else {
	            System.out.println("Stack is full !");
	        }
	}

	@Override
	public int Pop() {
		if (!IsEmpty()) {
            int popelement = top;
            --top;
            System.out.println("Popped element :" + arr[popelement]);
            return arr[popelement];
 
        } else {
            System.out.println("Stack is empty !");
            return 0;
        }
		
	}

	
	
}
