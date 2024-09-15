package t2;

public class course extends student{
	String coursename;
	
	public course(String name1, int age1,String coursename1) {
		super(name1, age1);
		coursename=coursename1;
	}
	public void displaycourseinfo() {
		displayinfo();
		System.out.println("corse name:" +coursename);
		
	}


	
	
}
