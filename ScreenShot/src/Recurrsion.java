
//Through recurssion we can add number from 1 to 10 without loop
public class Recurrsion {
	
	static int i = 1;
	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	}
	
	public static void printn(int l) {
		if(l>10){		
		System.out.println(l);
		l++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int result = sum(10);
		 
//	    System.out.println(result);
	    if (i <= 100)
        {
            System.out.printf("%d ", i++);
            main(null);
        }
	}
}
