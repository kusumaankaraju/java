package kusuma;

public class class2 {
 
	public class2() {
		this(10,20,30);
		System.out.println("default constructor");
	}
	public class2(int a) {
		this (10,20,30,40);
		System.out.println("one parameterised constructor");
	}
	public class2(int a ,int b) {
		this();
		System.out.println("two parameterised constructor");
		}
	public class2(int a, int b, int c) {
	 System.out.println("three parameterised constructor");
	}
	public class2(int a,int b,int c,int d) {
		this(10,20);
		System.out.println("four parameterised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 a=new class2(10);

	}

}
