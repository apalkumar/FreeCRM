import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class reverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> strArr = new ArrayList<String>(Arrays.asList("Anil","Singh","Gwalior","MAthura"));
		System.out.println("Before Reversing"+strArr);
	
		Iterator i2 = strArr.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
//			System.out.println();
		}
		
//		Comparator cmp = Collections.reverseOrder();
//		Collections.sort(strArr,cmp);
		
		
		
		Collections.reverse(strArr);
		System.out.println("After Reversing"+strArr);
		Iterator i1 = strArr.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
//			System.out.println();
		}

	}

}
