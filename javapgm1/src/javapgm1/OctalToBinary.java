package javapgm1;
import java.util.*;
public class OctalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int i=0;
		String octalNumber;
		String binaryValue="";
		
		System.out.print("Octal Number = ");
		octalNumber=s.nextLine();
		
		while(i<octalNumber.length())
		{
			char c=octalNumber.charAt((int)i);
			switch(c)
			{
			case '0':
				binaryValue=binaryValue+"000";
				break;
			case '1':
				binaryValue=binaryValue+"001";
				break;
			case '2':
				binaryValue=binaryValue+"010";
				break;
			case '3':
				binaryValue=binaryValue+"011";
				break;
			case '4':
				binaryValue=binaryValue+"100";
				break;
			case '5':
				binaryValue=binaryValue+"101";
				break;
			case '6':
				binaryValue=binaryValue+"110";
				break;
			case '7':
				binaryValue=binaryValue+"111";
				break;
			default:
				System.out.println("Invalid octal digit "+octalNumber.charAt((int)i));
				break;
			
			}
		i++;
		}
	 System.out.println("Binary value= "+binaryValue);
	 
	 s.close();
	
	/* int value=Integer.parseInt(binaryValue);
	Integer.toOctalString(value);
	System.out.println("Octal value="+Integer.toOctalString(value)); */
	}

}
