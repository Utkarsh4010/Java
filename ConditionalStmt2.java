public class ConditionalStmt2
{
 public static void main(String [] args){
  int mark = 85;
  if(mark>=1 && mark<=100){
	if(mark>=40 && mark<=49){
	System.out.println("pass class");
        }
	else if(mark>=50 && mark<=59){
	System.out.println("second class");
	}
	else if(mark>=60 && mark<=74){
	System.out.println("first class");
	}
	else if(mark>=75 && mark<=100){
        System.out.println("Distiction");
        }
	else if(mark>=1 && mark<=39){
	System.out.println("fail");
	}	
      }
	else {
	System.out.println("invalid mark");
	}


}





}