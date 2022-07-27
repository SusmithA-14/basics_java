import java.util.Scanner;

public class method {
    public static void printname(String name) {
        System.out.println("your name is: "+ name);
    }
    public static void printage(int age) {
        System.out.println("and your age is: "+ age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        printname(name);
        printage(age);
    }
    
}
