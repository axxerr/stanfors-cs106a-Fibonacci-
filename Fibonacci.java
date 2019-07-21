import acm.program.ConsoleProgram;


public class Fibonacci extends  ConsoleProgram  {
	public void run(){
		int number1=0;
		int number2=1;
		 while(number1<MAX_VALUE){
			 println(number1);
			   int number3=number1+number2;
		        number1=number2;
			    number2=number3;
			 
		 }
	}
private static final int MAX_VALUE=10000;
}
