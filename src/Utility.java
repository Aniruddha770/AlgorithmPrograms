import java.util.Scanner;

public class Utility {
    Scanner sc = new Scanner(System.in);


    /**
     * Function To Check Prime No Between 0 to 1000
     */

    public static void prime() {
        System.out.println();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(j + " ");
        }
    }

    /**
     * Function to find the is pallindrome or not
     */
    public static boolean isPallindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }

        return false;
    }
        /**
         * Function helping prime() to check if prime is pallindrome and print it
         */
        public static void primePallindrome() {

            System.out.println();
            boolean b;
            for (int j = 2; j <= 1000; j++) {
                b = true;
                for (int i = 2; i < j / 2; i++) {
                    if (j % i == 0) {
                        b = false;
                        break;
                    }
                }
                if (b && isPallindrome(j))
                    System.out.print(j + " ");
            }
        }


}
