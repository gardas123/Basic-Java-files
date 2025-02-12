					// This Keyword
class ThisKeyword{
	int a=100;
	ThisKeyword(){
		System.out.println("Default Constructor");	
	}
	ThisKeyword(int a){
		this();
		a=a;
		System.out.println("Instance variable :"+this.a);
	}
	public static void main(String arg[]){
		ThisKeyword Tk = new ThisKeyword(10);	
	}
}
