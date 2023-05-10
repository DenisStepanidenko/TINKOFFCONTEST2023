package Problem3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        n = scanner.nextInt();
        s = scanner.next();
        int minSize = Integer.MAX_VALUE;
        int aFlag = 0, bFlag = 0, cFlag = 0, dFlag = 0;

        int left = 0, right = 0;
        while (right < n) {
            if (s.charAt(right) == 'a') {
                aFlag += 1;
            } else if (s.charAt(right) == 'b') {
                bFlag += 1;
            } else if (s.charAt(right) == 'c') {
                cFlag += 1;
            } else {
                dFlag += 1;
            }

            while (aFlag > 0 && bFlag > 0 && cFlag > 0 && dFlag > 0 && left < right) {
                minSize = Math.min(minSize, right - left + 1);
                if (s.charAt(left) == 'a') {
                    aFlag -= 1;
                } else if (s.charAt(left) == 'b') {
                    bFlag -= 1;
                } else if (s.charAt(left) == 'c') {
                    cFlag -= 1;
                } else {
                    dFlag -= 1;
                }
                left++;
            }
            right++;
        }
        if (minSize == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minSize);
        }
    }
}
