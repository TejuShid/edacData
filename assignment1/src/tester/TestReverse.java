package tester;

import java.util.Scanner;

import p1.ReverseArray;

public class TestReverse {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter array size ");
	int size = sc.nextInt();
	int arr1[]=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println(" enter elem");
		arr1[i]=sc.nextInt();
	}
	ReverseArray r = new ReverseArray();
	
	r.reverseArrayStack(arr1);
}
}
