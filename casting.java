public class casting {
    public static void main(String[] args) {
        // casting ->

        //implicit casting

        double fp=45.25;
        int jh=70;
        double to=fp+jh;
        System.out.println(to);

        //explicit casting

        int ab=100;
        double ba=45.32;

        //int fa=ab+ba;-> error bcz double is larger than int so we cannot store value of double in int so 
        // explicitly convert it
        //i.e.,by converting double value ba to int 

        int fo=ab+(int)ba;
        System.out.println(fo);

    }
    
}
