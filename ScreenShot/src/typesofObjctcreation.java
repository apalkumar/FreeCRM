import java.lang.reflect.Constructor;

public class typesofObjctcreation {
	
	typesofObjctcreation(){
	System.out.println("Hello");
	}

	void add() {
		System.out.println("Address");
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
//		First way to create the object
		typesofObjctcreation obj = new typesofObjctcreation();
		typesofObjctcreation obj1 = (typesofObjctcreation)obj.clone();
		
//		below method i.e. newInstance() is deprecated now().
//		typesofObjctcreation obj3 = typesofObjctcreation.class.newInstance();
		
		obj.add();
		obj1.add();
		
	
	
	}

}
