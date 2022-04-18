package kusuma;

public class class1 {

	public int add(int a,int b ) {
		return a+b;
	}
	public int sub(int a,int b ) {
		return a-b;
	}
	public int mul(int a,int b ) {
		return a*b;
	}
	public int div(int a,int b ) {
		return a/b;
	}
	
    public static void main (String[]args) {
	class1 a= new class1();
	int a1= a.mul(10,2);
	int a2=a.add(a1, 2);
	int a3=a.sub(a2,2);
	int a4=a.sub(a3,2);
	int a5=a.add(a4, 2);
	int a6=a.div(a5,2);
	System.out.println("final result is " +a6);
    }

}
