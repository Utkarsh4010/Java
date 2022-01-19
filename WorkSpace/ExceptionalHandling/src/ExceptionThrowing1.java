

public class ExceptionThrowing1 {

	public static void main(String[] args) throws DivisionException {
		int result ;
		result=div(23, -4);//caller
		System.out.println("Result: " + result);

	}
	
	public static int div(int a, int b) throws DivisionException{
		if(a<0 || b<0) {
			//throw new ArithmeticException("You cannot perform division for negative numbers.");
			throw new DivisionException();
		}
		int ans=a/b;
		return ans;
	}

}
