public class constant {
    public static void main(String[] args) {
        int age=20;
        //age is changed then
        age=21;
        // again age is changed
        age=22;

        //for example the value of pi is 22/7 or 3.14f so the value shouldn't have to changed so we use final keyword.
        //final keyword-> the value of const is fixed,cannot be changed further.
        //(and final variable are can represented in caps).
        final float pi=3.14f;
        //the value cannot be changed further

        System.out.println(pi+" "+age);
        /*
         * a=2
         * b=++a
         * 
         * a=2
         * b=a++
         */

    }
    
}
