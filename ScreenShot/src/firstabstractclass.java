
public abstract class firstabstractclass {
	
	abstract void method1();
	
	public void method2() {
		System.out.println("Hello");
	}
	
	private void method3() {
		System.out.println("HEllo PRivate");
	}
	
	protected void method4() {
		System.out.println("Hello Protected");
	}
	
	public String method5(){
		System.out.println("HEllo Public String return Type");
		return "str";
	}
	
	public final void mehtod6() {
		
	}
}


class bachha extends firstabstractclass {
	
	public static void main(String[] args) {
	
		bachha obj = new bachha();
		obj.method1();
		obj.method2();
		obj.method4();
//		obj.mehtod6();
		obj.method5();
}

//	@Override
	void method6() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

}

abstract class anotherbachha extends bachha{
	
	public static void main(String[] args) {
	
	anotherbachha obj1 = (anotherbachha) new bachha();
	obj1.method1();
	}
//	@Override
//	void method1() {
		// TODO Auto-generated method stub
//		super.method1();
//	}
	
	
}
