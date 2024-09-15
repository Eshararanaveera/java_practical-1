package t2;

public class student {

	 protected String name;
	protected int age;
	
	public student(String name1,int age1) {
		name=name1;
		age=age1;
		
	}

	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}


	
	public void displayinfo() {
		System.out.println("name :"+getName());
		System.out.println("age :"+getAge());

	}
} 
