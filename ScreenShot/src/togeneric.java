import java.util.ArrayList;
import java.util.Arrays;

public class togeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		//		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		//		al.add(10); // Compiler allows /this
		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);
		// Causes Runtime Exception
		//		String s3 = (String)al.get(2);
		System.out.println(s1);
		System.out.println(s2);
		//		System.out.println(s3);

		String str1[] = new String[al.size()];
		Object[] str = al.toArray();

		int i = 0;
		for (Object obj : str) {
			str1[i++] = (String)obj;
		}

		System.out.println(Arrays.toString(str1));
		
	
		
	}

}
