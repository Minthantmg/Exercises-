package Operator;

public class TestIncrement {

	public static void main(String[] args) {
		
		int i = 1; // assign value to i
		int iInc; // declear iInc
		iInc = i++; //assign value of postfix increment i to iInc
		
		System.out.println("The value of i is " + i + " and value of iInc is " + iInc);
		
		iInc = ++i; //assign value of prefix increment of value i to iInc
		
		System.out.println("The value of i is " + i + " and value of iInc is " + iInc);
	} 

}
