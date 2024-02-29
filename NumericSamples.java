//********************************************************************
//  Examples of using DecimalFormat patterns
//********************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class NumericSamples
{
   //-----------------------------------------------------------------
   //  Calculates the area and circumference of a circle given its
   //  radius.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int radius;
      double area, circumference;

      Scanner scan = new Scanner (System.in);

      float num1 = 11.975f;
      float num2 = 105.150f;
      float num3 = 14321.1050f;
      float num4 = 0.618f;



      DecimalFormat fmt1 = new DecimalFormat ("0.###");
      DecimalFormat fmt2 = new DecimalFormat ("0.##");
  	  DecimalFormat fmt3 = new DecimalFormat ("0.0");
  	  DecimalFormat fmt4 = new DecimalFormat ("$#,##0.##");

  	  System.out.println("==== Using 0.### ====");
  	  System.out.println("\t" + fmt1.format(num1));
      System.out.println("\t" + fmt1.format(num2));
      System.out.println("\t" + fmt1.format(num3));
      System.out.println("\t" + fmt1.format(num4));

  	  System.out.println("==== Using 0.## ====");
  	  System.out.println("\t" + fmt2.format(num1));
      System.out.println("\t" + fmt2.format(num2));
      System.out.println("\t" + fmt2.format(num3));
      System.out.println("\t" + fmt2.format(num4));

      System.out.println("==== Using 0.0 ====");
	  System.out.println("\t" + fmt3.format(num1));
	  System.out.println("\t" + fmt3.format(num2));
      System.out.println("\t" + fmt3.format(num3));
      System.out.println("\t" + fmt3.format(num4));

      System.out.println("==== Using $#,##0.## ====");
	  System.out.println("\t" + fmt4.format(num1));
	  System.out.println("\t" + fmt4.format(num2));
      System.out.println("\t" + fmt4.format(num3));
      System.out.println("\t" + fmt4.format(num4));

   }

}
