package tester;

import java.util.Scanner;

import p1.*;

public class Test {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size of stack");
		
		StackArray stack = new StackArray(sc.nextInt());
		      
		 boolean flag = false;
		 while(!flag) {
			 System.out.println("1.push elements");
			 System.out.println("2.pop elements");
			
			 System.out.println("3.exit");
			 System.out.println(" enter your choice");
			 
			 switch (sc.nextInt()) {
			case 1: System.out.println(" enter element to array");
					stack.Push(sc.nextInt());
				break;
					
			case 2: stack.Pop();
				break;
				
			case 3:
				System.out.println("exit");
				flag = true;
				break;
			}
		 }
		 
	}

}
