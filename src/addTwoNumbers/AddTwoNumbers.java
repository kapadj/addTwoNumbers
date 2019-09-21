package addTwoNumbers;

import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbers {

	public static LinkedList<Integer> addTwoNumbers( LinkedList<Integer> one, LinkedList<Integer> two)
	{
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		
		
		
		
		
		return resultList;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> one = new LinkedList<Integer>(Arrays.asList(1,2,3));
		LinkedList<Integer> two = new LinkedList<Integer>(Arrays.asList(1,2,3));
		
		LinkedList<Integer> sum = addTwoNumbers(one, two);
		
		for(int count = 0; count < sum.size(); count++)
			System.out.println(sum.get(count));
	}
}
