public class ch_5_for_loop_continue {
    public static void main(String[] args) {
        /*int  i=0;
        for (i=0;i<5;i++){
           //  System.out.println(i);
          //   System.out.println("for loop continue statement");
            if (i==3){
                System.out.println("using continue");
                continue; // continue statement to remove 3 output line
            }
                System.out.println(i);
                System.out.println("for loop continue statement");

    }*/


        int i=0;
        do {
            i++;
            if (i==2) {
                System.out.println("using continue");
                continue; // continue statement to remove 3 output line
            }
            System.out.println(i);
             System.out.println("for loop continue statement");

         }while(i<5);
System.out.print("loop end hear");
    }
}
