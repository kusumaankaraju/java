package sum;

public class sum {

	public int  add(int a ,int b)
	{
		return a+b;
		
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a ,int b) {
		return a*b;
	}
	public int div(int a ,int b ) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum a= new sum();
		int a1= a.add(10,2);
		int a2=a.sub(a1, 2);
		int a3=a.add(a2,2);
		int a4=a.mul(a3,2);
		int a5=a.div(a4, 2);
		System.out.println("final result is " +a5);

	}
}

