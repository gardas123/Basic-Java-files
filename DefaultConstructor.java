class DefaultConstructor1{
	DefaultConstructor1(){
		System.out.println("Default Constructor 1");		
	}
}

class DefaultConstructor{
					//Default Constructor
	DefaultConstructor(){
		System.out.println("Default Constructor 2");
	}

	public static void main(String arg[]){

		DefaultConstructor dc = new DefaultConstructor();
		DefaultConstructor1 dc1 = new DefaultConstructor1();
	}
}
