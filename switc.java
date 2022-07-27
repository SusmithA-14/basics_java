import java.util.Scanner;

public class switc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input day");
        int day=sc.nextInt();
        switch (day) {
            case 1:
            System.out.println("Monday");
            case 2:
            System.out.println("Tuesday");
            case 3:
            System.out.println("Wednesday");
            default:
            System.out.println("thu-sun");
        }
    }    
}
