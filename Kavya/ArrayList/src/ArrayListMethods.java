import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		/*Teacher t1 = new Teacher("123","kavya");
		Teacher t2 = new Teacher("321","shiva");*/
		al.add("chacha");
		al.add("yuyu");
		al.add("kuku");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("kuku"));
		/*Collections.sort(al);*/
		
		Arrays.sort(al.toArray());
		System.out.println(al);
		for(String temp : al) {
			System.out.println(temp);
		}
	}
}