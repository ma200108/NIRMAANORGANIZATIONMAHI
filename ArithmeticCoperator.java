package Day1;

public class ArithmeticCoperator {
	public static void main(String[] args) {
		int a = 40;
		int b = 20;
		int c = 30;
		int d = 10;
		
		
	System.out.println("Enter the first number :" +a);
	System.out.println("Enetr the second number :" +b);
	
	System.out.println("Arithmetic operators :");
	System.out.println("Addition :" + (a+b));
	System.out.println("Subtraction :" + (a-b));
	System.out.println("Multiplication :" + (a*b));
	System.out.println("Division  :" + (a/b));
	System.out.println("Modulus :" + (a%b));
	System.out.println("Relational Operation :");
	System.out.println((a+ ">" +b)+ ":" +(a<b));
	System.out.println((a+ "<" +b)+ ":" +(a>b));
	System.out.println((a+ ">=" +b)+ ":" +(a<=b));
	System.out.println((a+ "<=" +b)+ ":" +(a>=b));
	System.out.println((a+ "==" +b)+ ":" +(a==b));
	System.out.println((a+ "<" +b)+ ":" +(a>b));
	System.out.println((a+ "!=" +b)+ ":" +(a!=b));
	System.out.println("Logical Operator :");
	System.out.println("("+a+ ">" +b+")"+ " AND " +"("+c+ "<" +d+")"+ " : " +((a>b)&&(c<d)));
	System.out.println("("+a+ "<" +b+")"+ " AND " +"("+c+ ">" +d+")"+ " : " +((a<b)&&(c>d)));
	int e = 10;
	System.out.println("Initial Value = "+e);
	System.out.println("After += : "+ (e +=12));
	System.out.println("After -= : " + (e-=12));
	System.out.println("After  *= : " + (e*=12));
	System.out.println("AFTER /=: "+ (e/=12));
	System.out.println("After  %= : " + (e%=12));
	System.out.println("Unary Operation");
	int h = 12;
	System.out.println("Initial value: "+h);
	System.out.println("After increment: " + ++h);
	System.out.println("After decrement: " + --h);
	System.out.println("Conditinal operation");
	String Ans = (h%2==0)? "Even" : "Odd";
	System.out.println(h+ "is " +Ans);
	
			}
	

}
