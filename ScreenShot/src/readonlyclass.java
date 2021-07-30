
public class readonlyclass {
	
//	private String collage = "AKG";
	private String college;

//	public String getcolleage() {
//		return collage;
//	}
	
	public String setCollege(String college) {
		this.college = college;
		return college;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readonlyclass eoc = new readonlyclass();
//		System.out.println(eoc.getcolleage());
		System.out.println(eoc.setCollege("Anil"));
	}

}
