import java.util.Scanner;
public class Collatz{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int result=scanner.nextInt();
        try{
            int step=printCollatzSequence(result);
            System.out.println("Numbers of steps:"+step);
        }catch(IllegalArgumentException e){
            System.out.println("Please use valid input.");
        }
    }
    public static int printCollatzSequence(int result){
        int n=0;
        if (result<=0){
            throw new IllegalArgumentException("Please enter integer.");
        }
            if (result==1){
                return 1;
            }else if (result%2==1){
                result=3*result+1;
                System.out.println(result);
                n+=1;
                return n+printCollatzSequence(result);
            }else if (result%2==0){
                result=result/2;
                System.out.println(result);
                n+=1;
                return n+printCollatzSequence(result);
            }else {
                System.out.println("Invalid input.");
                return -1;
            }
        }
}