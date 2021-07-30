import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class examplelinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Anil");
		 list.add("Steve");
	     list.add("Carl");
	     list.addLast("Paal");
	     list.add("Raj");
	     list.addFirst("Rick");
//		System.out.println(list);
//		System.out.println(list.get(0));

		Iterator<String> iterator=list.iterator();
		ListIterator listIterator = list.listIterator(list.size());
		
		
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
// Here we have started with the empty list and as per definition addlast() method just shift the
//	     the element to the end but if we will add the element after the addlast then it will add
//	     after the addlast element, check the result
	}

}
