
public class StringExample {
	public static void main(String arg[]) {
		String s1 = "Hello virinchi";

		String s2 = new String("Virinchi");

		char arr[] = { 'a', 'b', 'c' };

		String obj = new String(arr);

		System.out.println("the value of s1==>" + s1);

		System.out.println("the value of s2==>" + s2);

		System.out.println("the value of obj==>" + obj);

		System.out.println("the length of s1 is==>" + s1.length());

		System.out.println("the concat of s1 and s2==>" + s1.concat(s2));

		boolean x = s1.startsWith("Virinchi");

		if (x == true)
			System.out.println("s1 starts with Virinchi");
		else
			System.out.println("not starting with virinchi");

		System.out.println(s1.replace('H', 'g'));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));

	}

}
