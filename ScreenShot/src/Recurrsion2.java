
//Through recurssion we can add number from 1 to 10 without loop
public class Recurrsion2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printNum(1);
		printNumber(1,10);
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNumber(int Snum, int eNum) {
		if(Snum<=eNum) {
			System.out.println(Snum);
			Snum++;
			printNumber(Snum, eNum);
		}
	}
}
