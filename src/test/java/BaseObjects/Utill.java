package BaseObjects;



public class Utill {

	ChildClass childClass;
	
	public void setUp() {
		System.out.println("In side method of SetUp");
		childClass = new ChildClass();
		childClass.childMethod();
	}
}
