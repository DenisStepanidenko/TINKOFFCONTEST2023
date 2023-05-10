package Problem2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, m, k;
        n = scanner.nextDouble();
        m = scanner.nextDouble();
        k = scanner.nextDouble();
        System.out.println((int) Math.ceil((n * k) / m));

    }
}
