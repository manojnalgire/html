public class ch_5_for_loop {
    public static void main(String[] args) {
      int i = 10;
      for  (i = 0; (i < 5); i++) {
          System.out.println(i);
          System.out.println("For loop start");


          if (i == 2) {
              System.out.println(" Using Break statement");
              System.out.println(" for loop end ");
              break;
          }
      }

    }
}
