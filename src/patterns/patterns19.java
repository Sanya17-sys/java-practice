package patterns;

public class patterns19 {

        public static void main(String[] args) {
            int n = 5;
            int mid = n / 2;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int d = Math.abs(i - mid) +
                            Math.abs(j - mid);

                    if (d == mid || d == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

