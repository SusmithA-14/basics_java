public class array{
    public static void main(String[] args) {
        int[] marks= new int[] {1,2,3,5};
        /*
        int[] marks={1,2,3,4,5}; or

        int[] marks= new int[10];
        
        marks[0]=23;
        marks[2]=24;
        marks[7]=22;*/
        
        /*
         * 2d array->>>
         * 
         * int[][] marks={{12,34,34},{12,55,21}};
         * System.out.println(marks[0][0])  ->>>12
         * 
         */

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
    }

}