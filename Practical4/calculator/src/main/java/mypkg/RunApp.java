package mypkg;
import java.util.Scanner;
public class RunApp{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();

        while(true){
            System.out.println("Enters the first number:");
            int num1=scanner.nextInt();
            System.out.println("Enters operator '+', '-', '*' or 'Q', 'q' to quit:");
            char operator=scanner.next().charAt(0);
            System.out.println("Enter the second number:");
            int num2=scanner.nextInt();
            int result;

            switch(operator){
                case '+':
                    result = calculator.add(num1,num2);
                    break;
                case '-':
                    result = calculator.subtract(num1,num2);
                    break;
                case '*':
                    result = calculator.multiple(num1,num2);
                    break;
                case 'q':
                case 'Q':
                    return;
                default:
                    System.out.println("Invalid input.Try again.");
                    continue;
            }
            System.out.println("Result:"+result);
            System.out.println();
        }
    }
}