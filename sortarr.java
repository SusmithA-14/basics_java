import java.util.Arrays;

public class sortarr {
    public static void main(String[] args) {
        int[] marks=new int[10];
        marks[0]=23;
        marks[1]=24;
        marks[2]=22;
        marks[3]=14;
        marks[4]=34;
        marks[5]=92;

        //length
        System.out.println(marks.length);
        System.out.println("before sorting");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("after sorting");
        //sort
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    
}
