package Program;

interface Printable 
      {
	   void display();
	  }
	  interface Calculate 
	   {
	    int  cal(int n);
	   }
class Cals implements Printable, Calculate
 {
	   public void display() 
	    {
	      System.out.print("square of a number:");
	    }
	   public int cal(int a)
	     {
	      return a*a;
	     }
 }
class Calcube implements Printable, Calculate
{
	  public void display() 
	   {
		 System.out.print("Cube of a number: ");
	   }
	 public int cal(int a)
	   {
		  return a* a *a;
	   }
}
public class pr4 
{
   public static void main(String args[])
    {
	 Cals cs = new Cals();
	 cs.display();
	 System.out.println(cs.cal(3));
	 
	 Calcube cc = new Calcube();
	 cc.display();
	 System.out.println(cc.cal(2));
    }
}