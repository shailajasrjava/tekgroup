package StringBufferDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the sur name:");
		String sur;
		sur = br.readLine();
		System.out.println("the value of sur:" + sur);
		System.out.println("====================");
		System.out.println("enter the middle name");
		String mid;
		mid = br.readLine();
		System.out.println("enter the value of mid:" + mid);
		System.out.println("=====================");
		System.out.println("enter the last name");
		String last;
		last = br.readLine();
		System.out.println("enter the value of last" + last);

		StringBuffer sb = new StringBuffer(" hai vamshi");
		System.out.println("the value of sb is:" + sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.append(sur));
		System.out.println(sb.hashCode());

	}

}
