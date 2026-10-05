package patterns;

public class patterns5 {

        public static void main(String[] args) {

            int n = 5;

            // Upper half
            for (int i = 1; i <= n; i++) {

                // Spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                // Decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }

            // Lower half
            for (int i = n - 1; i >= 1; i--) {

                // Spaces
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }

                // Decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }

