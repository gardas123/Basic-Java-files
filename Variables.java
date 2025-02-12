				//Types of variables 1)Local 2)Static 3)instance
class Variables{
	static int a=10;
	int b=2;

	
	public static void main(String arg[]){
		Variables v= new Variables();

		int c=100;

		System.out.println("Local Variable :"+c);
		System.out.println("Static Variable :"+Variables.a);
		System.out.println("Instance Variable :"+v.b);
	}
}
