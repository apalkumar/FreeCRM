import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  First Approach
		String str = "Anil";
//		System.out.println(str.length());
		char[] strchr = str.toCharArray();
		
		for(int i=strchr.length-1; i>=0;i--) {
			System.out.println(strchr[i]);
		}
// Second Approach
		String str1 = "Paal";
		char[] str1new = str1.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(char c: str1new) {
			list.add(c);
		}
		System.out.println("After Adding them in List"+list);
		
		Collections.reverse(list);
		
		Iterator i1 = list.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}
