package simpleprograms;
import java.io.*;

public class PalindromeusingBufferReader {
	
	 public static void main(String [] args) throws IOException{
	  try{
	   BufferedReader obc=new BufferedReader (new InputStreamReader(System.in));
	   int r,n1,n2;
	   int rev=0;
	   System.out.println("Enter the number: ");
	   n1=Integer.parseInt(obc.readLine());
	   n2=n1;
	    
	   while(n1>0) {
	    r=n1%10;
	    rev=rev*10+r;
	    n1=n1/10;
	   }
	    
	   if(rev==n2) {
	    System.out.println("The number is Palindrome Number.");
	   } else {
	    System.out.println("The number is not a Palindrome Number.");
	   }
	  } catch(IOException e) {
	   System.out.println("Wrong number entered.");
	  }
	 }
	}