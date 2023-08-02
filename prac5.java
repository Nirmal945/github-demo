import java.util.Scanner;
public class prac5
{
	public static void main(String args[])
	{
                     System.out.println("1. Motor\n2. fan\n3. Tube\n4. Wires\n5. All other items\n");
		float price[]= {750.254f,500.50f,50.145f,300.45f,10.25f};
		float tax[]={8,12,5,7.5f,3};
		float rs=0;
		int c;
		System.out.println("Product code\tPrice");
		for(int i=1;i<6;i++)
		{
			System.out.println( i + "\t\t" + price[i-1]);
		}
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your choice :");
		c=sc.nextInt();
		switch(c)
		{
		 	case 1:
			{
			   rs = (price[c-1]+price[c-1] * tax[c-1])/100;
			   System.out.println("Price of motor = " +rs);
			   break;
			}	
			case 2:
			{
			   rs = (price[c-1]+price[c-1] * tax[c-1])/100;
			   System.out.println("Price of fan = " +rs);
			    break;
			}	
   			case 3:
			{
			   rs = (price[c-1]+price[c-1] * tax[c-1])/100;
			   System.out.println("Price of tube = " +rs);
				 break;
			}
			case 4:
			{
			   rs = (price[c-1]+price[c-1] * tax[c-1])/100;
			   System.out.println("Price of wires = " +rs);
				 break;
			}
	    		case 5:
			{
			   rs = (price[c-1]+price[c-1] * tax[c-1])/100;
			   System.out.println("Price of other items = " +rs);
			    break;
			}
			default:
			{
			   System.out.println("Please enter valid choice");
				 break;
			}
		}
		System.out.println("Your bill is Rs."+rs);
		System.out.println("Programmed by Devarsh Chhatrala 21DCE014");
	}
}
