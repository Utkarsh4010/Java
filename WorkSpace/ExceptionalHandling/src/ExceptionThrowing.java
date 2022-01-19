import java.io.IOException;
import java.sql.SQLException;
public class ExceptionThrowing {

	public static void main(String[] args) {
		int result;
		try {
			result=div(23,-4);
			System.out.println("Result: " + result);
		}
		catch(DivisionException e) {
			e.showMsg();
		}

	}
	public static int div(int a, int b) throws DivisionException{
		
		if(1<0 || b<0) {
			//throw new ArithmeticException("You cannot perform division for negative numbers");
			throw new DivisionException();
		}
		int ans=a/b;
		return ans;
	}

}
