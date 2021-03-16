package Homework4;

import java.util.Scanner;

public class Rational_Test
{
public static void main(String[] args)
{
    Rational r1 = new Rational(1, 9);							//r1 ve r2 nesnelerini oluşturdum.
    Rational r2 = new Rational(4, 16);
    
    Rational result;
    Scanner input = new Scanner(System.in);
    
    int dec;
    
    System.out.print("Rational number 1: ");
    System.out.printf("%s\n", r1.print());
    System.out.print("Rational number 2: ");        
    System.out.printf("%s\n", r2.print());
    System.out.print("Add Rational number 2 to 1: ");
    result = Rational.add(r1, r2);								//Rational classından add metodunu çağırarak toplama işlemi yaptım.
    System.out.printf("%s\n", result.print());
    System.out.print("Subtract Rational number 2 to 1: ");
    result = Rational.subtract(r1, r2);							//Rational classından subtract metodunu çağırarak çıkarma işlemi yaptım.
    System.out.printf("%s\n", result.print());
    System.out.print("Multiply Rational number 2 to 1: ");
    result = Rational.multiply(r1, r2);							//Rational classından multiply metodunu çağırarak çarpma işlemi yaptım.
    System.out.printf("%s\n", result.print());
    System.out.print("Divide Rational number 2 to 1: ");
    result = Rational.divide(r1, r2);							//Rational classından divide metodunu çağırarak bölme işlemi yaptım.
    System.out.printf("%s\n", result.print());
    System.out.println("To print result in floating point format");
    System.out.print("Enter number of decimal places: ");
    dec = input.nextInt();										//Sonucu float şekilde yazdırdım.
    System.out.printf("%s\n", result.printFloat(dec));
}
}
