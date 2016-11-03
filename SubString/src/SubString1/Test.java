package SubString1;

public class Test {
	public static void main(String args[]) {
		String S1 = " Hello ";// h-0.e-1,l-2,l-3,0-4
		System.out.println(S1.substring(0));// it prints the variables from h
		System.out.println(S1.substring(0, 1));// it includes the first variable
												// and exclude from 1
		System.out.println(S1.substring(1));// it prints variables from 1
		System.out.println(S1.substring(1, 2));// it prints the variable 1 and
												// exclude the from 2nd variable
		System.out.println(S1.trim());// it elemenates the spaces before and
										// after the string....
	}

}
