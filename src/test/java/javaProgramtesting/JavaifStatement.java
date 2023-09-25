package javaProgramtesting;

public class JavaifStatement {

	public static void main(String[] args) {
		ifElseStatment("2",2);
		ifElseIfStatment();
		

	}
	
	public static void swtichCases(int data) {
		switch(data) {
		case 1:
		break;
		case 2:
		break;
		case 3:
		break;
		case 4:
		break;	
		}
	}
	
	
	public static void ifClause(int data, String vData) {
		
		if(data==2) {
			System.out.println("Logger retuns : 2");
		}else {
			System.out.println("Logger is not retuns : 2");
		}
		
		if(vData=="2") {
			System.out.println("Logger retuns : 2");
		}else {
			System.out.println("Logger is not retuns : 2");
		}
		
		if(data==1) {
			System.out.println("Logger retuns : 2");
		}else if (data!=3) {
			System.out.println("Logger is not retuns : 2");
		}
	}
	
	public static void ifElseIfStatment() {
		int i = 3;
		int j = 4;
		int k = 2;
		
		if (i == 2) {
			System.out.println("int i is not equal to : 2");
		} else if(j==2){
			System.out.println("int j is not equal to : 2 ");
		}else if(k==3){
			System.out.println("int k is not equal to : 2 ");
		}else if(i==1){
			System.out.println("int i is not equal to : 1 ");
		}else if(j==0){
			System.out.println("int j is not equal to : 0 ");
		}else if(k==1){
			System.out.println("int k is not equal to : 1 ");
		}else if(k==0){
			System.out.println("int k is not equal to : 0 ");
		}else if(i==0){
			System.out.println("int i is equal to : 0 ");
		}else if(j==1){
			System.out.println("int j is equal to : 1 ");
		}else if(k==2){
			System.out.println("int k is equal to : 2 ");
		}
	}
	
	public static void ifElseStatment(String data, int Vdata) {
		int i=0;
		ifClause(Vdata,data);
		if(i==2) {
			System.out.println("int i is not equal to : 2");
		}else{
			System.out.println("int i is equal to : any numaric valuve except 2");
		}
	}

}
