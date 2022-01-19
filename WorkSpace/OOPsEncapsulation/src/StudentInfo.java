
public class StudentInfo {

	public static void main(String[] args) {
		Information data = new Information();
		data.setId(123456);
		data.setName("utkarsh suryawanshi");
		data.setMNo(8830796795l);
		data.printDetails();
		
	}

}

class Information{
	private int studentId;
	private String  studentName;
	private long MNo;
	
	//set data 
	public void setId(int id){
	        this.studentId = id;	
	}
		
		
		public void setName(String name) {
			if(studentName >=2 && studentName <= 20) {
				this.studentName = name;
			} else { 
				System.err.println("Invalid name, Name should be between 2-20");
				System.exit(0);
			}
		}
		
		public void setMNo(long mobile) {
			if(mobile == 10) {
	           this.MNo= mobile;
			} else {
				System.err.println("Invalid mobile number, it should be 10 ");
				System.exit(0);
			}
		}
	
		public int getId() {
			return studentId;
		}
		
		public String getName() {
			return studentName;
		}
	
		public String getMNo() {
			return MNo;
		}
    public void printDetails() {
    	System.out.println("Student Id : " + studentId);
    	System.out.println("Studenr Name : " + studentName);
    	System.out.println("Student Mobile Number : " + MNo);
    }	

	
	
}




