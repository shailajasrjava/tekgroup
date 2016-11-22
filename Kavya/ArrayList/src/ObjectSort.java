import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSort {

	public static void main(String[] args) {
		List<Family> a = new ArrayList<Family>();
		a.add(new Family("kavya","pathapally",24));
		a.add(new Family("keerthi","pathpaly",25));
		a.add(new Family("bharu","pathapally",22));
		Collections.sort(a);
		for(Family str:a)
		{
			System.out.println(str.fname+" " +str.lname+" " +str.age);
		}
	}

}
