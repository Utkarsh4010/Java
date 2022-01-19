public class ThisDemo
{
  int a = 20;
  public static void main(String [] args)
  {
    ThisDemo demo = new ThisDemo();
    demo.display();
  }

 public void display()
  {
    int a = 30;
    System.out.println(this.a * this.a);
  }
  


}
