package Homework4;

public class SavingsAccountTest
{
public static void main(String[] args)
{
    SavingsAccount saver1 = new SavingsAccount(2000.00);			//Saver 1 ve 2 için soruda verilen balan değerleri ile birlikte
    SavingsAccount saver2 = new SavingsAccount(3000.00);			//SavingsAccount'ı çağırdım. saver1 ve saver2 nesnelerini oluşturdum.
    
    double rate;		//Rate değişkenini double tanımladım.
    
    rate = 0.04;		//Soruda verilen %4'lük değeri rate atadım.        
    SavingsAccount.modifyInterestRate(rate);		//%4 değerini SavingsAccount classındaki modifyInterestRate metoduyla annualInterestRate değişkenine atadım.
    System.out.printf("Interest Rate: %.2f\n", rate);		// Yapılacak hesaplamanın Interest rateni ekrana bastım.
    
    System.out.println("Saver 1:");
    System.out.printf("Savings Balance: %.2f\n", saver1.getSavingsBalance());		//ilk Savings Balance'ı yazdırdım.
    System.out.printf("Interest: %.2f\n", saver1.calculateMonthlyInterest());		//Interest hesaplanıyor calculateMonthlyInterest() metodunu çağırdım ve yazdırdım.
    System.out.printf("Savings Balance: %.2f\n", saver1.getSavingsBalance());		//Son Savings Balance'ı saver1.getSavingsBalance() metodunu çağırdım ve yazdırdım.
    
    System.out.println("\nSaver 2:");
    System.out.printf("Savings Balance: %.2f\n", saver2.getSavingsBalance());		//ilk Savings Balance'ı yazdırdım.
    System.out.printf("Interest: %.2f\n", saver2.calculateMonthlyInterest());		//Interest hesaplanıyor calculateMonthlyInterest() metodunu çağırdım ve yazdırdım.
    System.out.printf("Savings Balance: %.2f\n\n", saver2.getSavingsBalance());		//Son Savings Balance'ı saver2.getSavingsBalance() metodunu çağırdım ve yazdırdım.    

    rate = 0.05;		//Soruda verilen %5'lük değeri rate atadım
    SavingsAccount.modifyInterestRate(rate);		//%5 değerini SavingsAccount classındaki modifyInterestRate metoduyla annualInterestRate değişkenine atadım.
    System.out.printf("Interest Rate: %.2f\n", rate);		// Yapılacak hesaplamanın Interest rateni ekrana bastım.

    System.out.println("Saver 1:");
    System.out.printf("Savings Balance: %.2f\n", saver1.getSavingsBalance());		//ilk Savings Balance'ı yazdırdım.
    System.out.printf("Interest: %.2f\n", saver1.calculateMonthlyInterest());		//Interest hesaplanıyor calculateMonthlyInterest() metodunu çağırdım ve yazdırdım.
    System.out.printf("Savings Balance: %.2f\n", saver1.getSavingsBalance());		//Son Savings Balance'ı saver1.getSavingsBalance() metodunu çağırdım ve yazdırdım.
    
    System.out.println("\nSaver 2:");
    System.out.printf("Savings Balance: %.2f\n", saver2.getSavingsBalance());		//ilk Savings Balance'ı yazdırdım.
    System.out.printf("Interest: %.2f\n", saver2.calculateMonthlyInterest());		//Interest hesaplanıyor calculateMonthlyInterest() metodunu çağırdım ve yazdırdım.
    System.out.printf("Savings Balance: %.2f\n\n", saver2.getSavingsBalance());		//Son Savings Balance'ı saver2.getSavingsBalance() metodunu çağırdım ve yazdırdım. 
}
}