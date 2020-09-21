package MathCalculate;

public class MathAdding {
	int x;
	int y;
	
	public int add() {
		return x+y;
	}
		
	
	public int multiply() {
		return x*y;
		
	}
			public static void main (String[]args) {
				MathAdding helper= new MathAdding();
				helper.x=10;
				helper.y=20;
				
				int result=helper.add();
				System.out.println("the result is "+result);
				
				
				int resultMult=helper.multiply();
				System.out.println("the result of multipling is "+resultMult);
			}
	 }

