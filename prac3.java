public class prac3
{
     public static void main(String args[])
    {
       double a=1234.5678;
       long x = (long)a; 
       System.out.println("Integer part: " +x);
       short y;
       y= (short)((a-x)*10000);
       System.out.println(" Fractional part: " +y);
       System.out.println("Displaying double value.........");
       System.out.println(x+ "." +y);
       System.out.println("Programed by Devarsh Chhatrala 21DCE014");
   }
}
