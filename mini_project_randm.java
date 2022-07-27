import java.util.Scanner;

//A simple mini project to understand basics of java better
//random number
//a random number is generated and ask the user to guess that random number, and if the number guessed by user is less than 
//random number than the code says tha number is too small and if the number guessed by user is larger than random number 
//then the code says it's too big and if the number guessed by user is equal to random number than says it's the correct number.
public class mini_project_randm {
    public static void main(String[] args) {
        int randomnumber=(int)(Math.random()*100);
        int usernumber=0;
        do {
            System.out.println("Guess my number(Tip: It ranges between 1 and 100):");
            Scanner sc=new Scanner(System.in);
            usernumber=sc.nextInt();

            if (usernumber==randomnumber) {
                System.out.println("HUHUHU!!! YESS you got it");
                break;
            }
            else if(usernumber>randomnumber){
                System.out.println("SORRY!! it's too large. Try again!!");
            }
            else if(usernumber<randomnumber){
                System.out.println("OOPS!! it's is too small. Give another try!");
            }
        } while (usernumber>=0);
        
    }
}
