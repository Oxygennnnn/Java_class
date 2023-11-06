
import java.util.Scanner;

class Door {
    private boolean isOpen=false;
    public void openDoor(){
        if(!isOpen){
            System.out.println("Door opened.");
            isOpen=true;
        }else{
            System.out.println("Door already opened!");
        }
    }
    public void closeDoor(){
        if (isOpen){
            System.out.println("Door closed.");
            isOpen=false;
        }else{
            System.out.println("Door already close!");
        }
    }  
}

class Testdoor{
    public static void main(String[] args){
        Door door=new Door();
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        while (choice!=3){
            System.out.println("1:Open door");
            System.out.println("2:Close door");
            System.out.println("3:Exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option!");    
            }
        }
        scanner.close();
    }
}
