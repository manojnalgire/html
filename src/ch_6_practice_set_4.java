public class ch_6_practice_set_4 {
    public static void main(String[] args) {

        // Practice Problem 6 Write a Java program to find the minimum element in an array
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
       // System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}
