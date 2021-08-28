package p1;

public class ReverseArray {

	
	public int[] reverseArrayStack(int [] arr) {
		
		StackArray s = new StackArray(arr.length);
		
		for(int i=0;i<arr.length;i++)
			s.Push(arr[i]);
		
		for(int j=0;j<arr.length;j++)
			arr[j]=s.Pop();
		
		return arr;
	}

	
}
