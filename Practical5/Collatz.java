import java.util.Scanner;
public class Collatz{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int result=scanner.nextInt();
        printCollatzSequence(result);
    }
    public static int printCollatzSequence(int result){
            if (result==1){
                return 1;
            }else if (result%2==1){
                result=3*result+1;
                System.out.println(result);
                return printCollatzSequence(result);
            }else if (result%2==0){
                result=result/2;
                System.out.println(result);
                return printCollatzSequence(result);
            }else {
                System.out.println("Invalid input.");
                return -1;
            }
        }
}