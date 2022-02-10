package simpleprograms;
import java.io.*;

public class LeapyearusingBufferReader {
	public static void main(String[] args) throws IOException{
      int year;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an Year : ");
      year = br.read();
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}