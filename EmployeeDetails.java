public class EmployeeDetails
{
 public static void main(String [] args)

     {
         Employee emp1;
         emp1 = new Employee();
         Employee emp2 = new Employee();
         emp1.id = 121;
         emp1.salary = 755577;
         emp1.gender = 'M';
         System.out.println("Employee 1");
         emp1.print();
         System.out.println("EMployee 2");
         emp2.print();//Default value print
        
     }
}
 
     class Employee
 {
   int id;
   double salary;
   char gender;
       public void print()
         {
           int id = 1000;
           System.out.println("this Id : " + this.id);
           System.out.println("id : " + id);
           System.out.println("Salary : "+ salary);
           System.out.println("Gender : " + gender);
         }   

  
}