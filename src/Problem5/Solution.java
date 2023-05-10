package Problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, answer = 0;
        n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x;
            x = scanner.nextInt();
            numbers.add(x);
        }

        int left = 0, right = 0;
        int sum = 0;
        int predSum = 0;
        boolean flag = false;
        while (right < n) {

            sum += numbers.get(right);
            if (left != right) {
                predSum += numbers.get(right);
            }


            if (sum == 0) {
                flag = true;
                if (left == 0 && right != n - 1) {

                    answer += (n - right - 1);

                } else if (right == n - 1 && left != 0) {

                    answer += left;

                } else if( right == n-1 && left == 0) {

                }
                else{

                    answer += 1 + left + (n - right - 1);

                }

                left++;
                sum = predSum;
                //predSum = predSum - numbers.get(left);
            }
            right++;
        }

        if (flag) {
            System.out.println(answer + 1);
        } else {
            System.out.println(answer);
        }
    }
}
