package tester;

import java.util.Scanner;

import p1.QueueArray;


public class TestQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size of queue");
		
		QueueArray queue = new QueueArray(sc.nextInt());
		      
		 boolean flag = false;
		 while(!flag) {
			 System.out.println("1.AddQ elements");
			 System.out.println("2.DeleteQ elements");
			
			 System.out.println("3.display");
			 System.out.println("4.exit");
			 System.out.println(" enter your choice");
			 
			 switch (sc.nextInt()) {
			case 1: System.out.println(" enter element to array");
					queue.insert(sc.nextInt());
				break;
					
			case 2: System.out.println(queue.remove());
				break;
				
			case 3:
				System.out.println("exit");
				flag = true;
				break;
			}
		 }
		 

	}

}
