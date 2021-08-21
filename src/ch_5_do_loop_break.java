public class ch_5_do_loop_break {
    public static void main(String[] args) {
       int i = 0;
        do {
            System.out.println(i);
            if(i==2) {
                System.out.println("do loop in break");
                break;
            }
                i++;

        }while (i<5);

    }
}
