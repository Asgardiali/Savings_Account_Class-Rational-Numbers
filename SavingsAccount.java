package Homework4;

public class SavingsAccount			//SavingsAccount adında class oluşturdum.

{
	private static double annualInterestRate;			//annualInterestRate static bir double değişken tanımladım.
  
	private double savingsBalance;			//savingsBalance adında bir double değişken tanımladım.
  
	public SavingsAccount(double sBal)			
 	{
      setSavingsBalance(sBal);
 	}
	
	public void setSavingsBalance(double sB)		//SavingsBalance set edilen metod.
 	{
     
          savingsBalance = sB;
 	}
  
	public double getSavingsBalance()				//SavingsBalance get edilen method.
	{
      return savingsBalance;
 	}
  
	public double calculateMonthlyInterest()			//Saving Balance hesabı için calculateMonthlyInterest() metodu oluşturdum.
 	{
      double interest;
      
      interest = (annualInterestRate * savingsBalance)/12;
      savingsBalance += interest;
      return interest;
 	}
  
  
	public static void modifyInterestRate(double aIR)			//Static void tipinde bir metod tanımlandı. 
  
	{
      annualInterestRate = aIR;
 	}
}

