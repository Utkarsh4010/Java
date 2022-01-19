public class G11
{
  public static void main(String [] args)
   {
     int a = 7;
     switch (a)
      {
         case 2 : case 3 : case 4 : case 5 : case 6:
        System.out.println("the working day");
        break;

        case 1 :  case 7 :
        System.out.println("the weekend");
        break;

        default:
         System.out.println("default day");
        

      }
   }


}