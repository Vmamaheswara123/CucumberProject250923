package BaseObjects;


import org.openqa.selenium.support.PageFactory;

public class LoginPageClass extends BaseClass{

	Utill utill;
	ChildClass childClass = new ChildClass();
	
	public LoginPageClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void userIsOnloginPage() {
		System.out.println("in side the method of userIsOnloginPage");
		utill = new Utill();
		utill.setUp();
		childClass.childMethod();
	}
	
	public void methodCall() {
		childClass.childMethod();
	}
}
