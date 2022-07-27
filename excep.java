public class excep {
    public static void main(String[] args) {
        int[] marks={75,80,88};
        //System.out.println(marks[8]);
        //System.out.println("exception handling");
        // we'll get error as Exception in thread "main" 
        //java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
        //the line System.out.println("exception handling"); doesn't execute bcz of exception. so use try catch block.
        try {
            System.out.println(marks[8]);
        } catch (Exception e) {
            //TODO: handle exception

        }
        System.out.println("exception handling");//now this line will executed.
    }
}
