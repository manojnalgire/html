public class ch_5_do_loop {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        int b = 10;

        do {
            System.out.println(b);
            b++;
        } while (b <= 5);// It will be print b=10 before print  b<5 means(1,2,3,4,5,10)
    }
}
