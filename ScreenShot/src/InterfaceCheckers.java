import tocheckinterfaceimplementation.interfacecheck;


public class InterfaceCheckers implements DefaultInterface,interfacecheck{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCheckers checker = new InterfaceCheckers();
        checker.run();
        checker.sleep();
        checker.runing();
        checker.sleeping();
        interfacecheck.getHorsePower(0, 0);
        String str = checker.stre;
        String strr = interfacecheck.stre;
        
        
        
	}

	
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping...");
		
	}



	public void sleeping() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void runingnewlast() {
		// TODO Auto-generated method stub
		
	}

}
