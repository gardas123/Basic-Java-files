class ParaConstructor{			// Parameterised constructor
	ParaConstructor(int x){
		int a=x;
		System.out.println("Intger value :"+a);
	}
	ParaConstructor(String x){
		String b=x;
		System.out.println("String Value :"+b);
	}
	ParaConstructor(float x){
		float c=x;
		System.out.println("Float Value :"+c);
	}
	public static void main(String arg[]){

		ParaConstructor PcI = new ParaConstructor(2);
		ParaConstructor PcS = new ParaConstructor("Hello");
		ParaConstructor PcF = new ParaConstructor(2.2f);	
	}
}
