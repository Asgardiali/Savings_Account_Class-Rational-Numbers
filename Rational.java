package Homework4;

public class Rational
{
  private int numerator;
  private int denominator;
  
  public Rational(int num, int denom)
  {
      setNumerator(num, commonDivisor(num, denom));
      setDenominator(denom, commonDivisor(num, denom));
  }
  
  public Rational()
  {
      setNumerator(1, commonDivisor(1, 1));
      setDenominator(1, commonDivisor(1, 1));
  }
  
  public void setNumerator(int n, int div)			//Numeratorü set ettim.
  {
      numerator = n/div;
  }
  
  public void setDenominator(int d, int div)		//Denominatorü set ettim.
  {
      if(d <= 0)
          denominator = 1;
      else
          denominator = d/div;
  }

  public static int commonDivisor(int n, int d)		//Sadeleşmektirmek için oluşturudum.
  {
      int divisor = 1;
      int count;
      
      if(n >= d && n%d == 0)				//2/1, 9/3 şeklindeki sayılar için oluşturuldu.
          divisor = d;
      
      else if(n <= d && d%n == 0)			//1/2,3/9 şeklindeki sayılar için oluşturuldu.
          divisor = n;
      
      else    								//Birbirine tam bölünmeyen sayılar için oluşturuldu.
      {
          if(n > d)
              count = d;
          else
              count = n;
          
          for(int i = 2; i <= count; i++)
          {
              if(n%i == 0 && d%i == 0)
                  divisor = i;
          }
      }
      return divisor;
  }
  
  public int getDenominator()		//Denominatörü get ettim.
  {
      return denominator;
  }

  public int getNumerator()			//Numaratörü get ettim.
  {
      return numerator;
  }

  public static Rational add(Rational r1, Rational r2)	//Toplama için oluşturduğum metod.
  {
      int num1, num2, num, denom;
      Rational result = new Rational();
      
      num1 = r1.getNumerator() * r2.getDenominator();
      num2 = r2.getNumerator() * r1.getDenominator();
      denom = r2.getDenominator() * r1.getDenominator();
      num = num1 + num2;
      result.setNumerator(num, commonDivisor(num, denom));
      result.setDenominator(denom, commonDivisor(num, denom));
      return result;
  }

  public static Rational subtract(Rational r1, Rational r2)		//Çıkartma için oluşturduğum metod
  {
      int num1, num2, num, denom;
      Rational result = new Rational();
      
      num1 = r1.getNumerator() * r2.getDenominator();
      num2 = r2.getNumerator() * r1.getDenominator();
      denom = r2.getDenominator() * r1.getDenominator();
      num = num2 - num1;
      result.setNumerator(num, commonDivisor(num, denom));
      result.setDenominator(denom, commonDivisor(num, denom));
      return result;
  }
  
  public static Rational multiply(Rational r1, Rational r2)		//Çarpma için oluşturduğum metod
  {
      int num, denom;
      Rational result = new Rational();
      
      num = r1.getNumerator() * r2.getNumerator();
      denom = r1.getDenominator() * r2.getDenominator();
      result.setNumerator(num, commonDivisor(num, denom));
      result.setDenominator(denom, commonDivisor(num, denom));
      return result;
  }
  
  public static Rational divide(Rational r1, Rational r2)		//Bölme için oluşturduğum metod
  {
      int num, denom;
      Rational result = new Rational();
      
      num = r1.getNumerator() * r2.getDenominator();
      denom = r1.getDenominator() * r2.getNumerator();
      result.setNumerator(num, commonDivisor(num, denom));
      result.setDenominator(denom, commonDivisor(num, denom));
      return result;
  }
  
  public String print()	//Integer değişkenleri string olarak bastıran metod
  {    
      return Integer.toString(getNumerator()) + '/'+ Integer.toString(getDenominator());
  }
  
  public String printFloat(int dec)				
  {
      double result;
      
      result = (double)getNumerator()/getDenominator();;
      result = (result * Math.pow(10, dec+1));
      result += 5;
      result /= Math.pow(10, dec+1);
      result = (int)(result * Math.pow(10, dec));
      result /= Math.pow(10, dec);

      return Double.toString(result);
  }
}
