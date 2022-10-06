import java.util.Scanner;

    public class Main {
        static boolean isEven(int a) {
            return (a%2==0);
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int i = 1;
            do {
                if (isEven(i) == true)
                    System.out.println(i);
                i++;
            } while (i<=a);
        }
    }
