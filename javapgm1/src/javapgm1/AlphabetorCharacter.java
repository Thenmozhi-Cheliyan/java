package javapgm1;
import java.util.*;

public class AlphabetorCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ch;
		System.out.println("Enter the character:");
		ch=s.next().charAt(0);
		s.close();
		if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Its a character");
			
		}
		else
		{
			System.out.println("Its not a character");
			
		}
			

	}

}
