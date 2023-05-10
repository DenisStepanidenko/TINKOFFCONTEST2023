package Problem1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int diff = x - y;
        for (int i = 0; i < 2; i++) {
            int z;
            z = scanner.nextInt();
            if (diff == 0) {
                if (y - z == 0) {

                    continue;
                }
                if (y - z > 0) {

                    diff = 1;
                } else {

                    diff = -1;
                }
            } else if (diff == 1) {
                if (y - z < 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
            } else {
                if (y - z > 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            y = z;
        }
        System.out.println("YES");
    }
}
