
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("K123");
		Student s2 = new Student("K123");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("S1 hashcode is "+s1+ " S2 hashcode is " +s2);
	}
}
