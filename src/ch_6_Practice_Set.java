public class ch_6_Practice_Set {

        public static void main(String[] args) {
            //  Practice Problem 1 Create an array of 5 floats and calculate their sum
           /* float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
            float sum = 0;
            for (float element : marks) {
                sum = sum + element;
            }
            System.out.println("The value of sum is " + sum);
            */


        /* Practice Problem 2 Write a program to find out whether a given integer
        is present in an array or not
         */
      /*  float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");


        }
*/

        /* Practice Problem 3 Calculate the average marks from an array containing marks of all
        students in physics using a for-each loop
         */

       float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);






        }
  }


