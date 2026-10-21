package patterns;

public class patterns18 {

        public static void main(String[] args) {
            int n = 9;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean border =
                            i == 0 || i == n - 1 ||
                                    j == 0 || j == n - 1;

                    boolean diagonal =
                            Math.abs(i - n / 2) ==
                                    Math.abs(j - n / 2);

                    if (border || diagonal)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

