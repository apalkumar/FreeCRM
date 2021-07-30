
public class checkString {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub String s1 = "Sharma is a good player";
		 * String s2 = new String("Sharma is a good player"); s2 = s2.intern();
		 * System.out.println(s1 ==s2);
		 */
		
		
		String s1 = "Javatpoint";  
        String s2 = s1.intern();  
        String s3 = new String("Javatpoint");  
        String s4 = s3.intern();          
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False          


	}
 
}
