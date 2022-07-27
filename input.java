import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your age");

        int age=sc.nextInt();
        System.out.println("inputed age is: "+age);
        /*
         * string name=sc.next();// next will gives output only a word if sentence is given but not entire sentence.so, use
         * nextline() i.e.,
         * string name=sc.nextline();
         */
    }
    
}
