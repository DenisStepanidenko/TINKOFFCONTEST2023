package Problem4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int maxCount = 1, oneCount = 0;
        int maxCountNumber = 0, minNumber = 0;
        int answer = 0;
        Map<Integer, Integer> allNumbers = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int x;
            x = scanner.nextInt();
            if (allNumbers.containsKey(x)) {
                if (allNumbers.get(x) + 1 > maxCount) {
                    maxCount = allNumbers.get(x) + 1;
                    maxCountNumber = x;
                }
                if (allNumbers.get(x) + 1 == 2) {
                    minNumber -= x;
                    oneCount--;
                }
                allNumbers.put(x, allNumbers.get(x) + 1);

            } else {
                oneCount++;
                minNumber += x;
                allNumbers.put(x, 1);

            }

            if (maxCount == 1) {
                if (i + 1 > answer) {
                    answer = i + 1;
                }
                continue;
            }

            boolean flagMin;
            if (oneCount == 1) {
                flagMin = true;
            } else {
                flagMin = false;
            }
            boolean flagMax = true;
            for (Map.Entry<Integer, Integer> entry : allNumbers.entrySet()) {
                if (flagMax) {
                    if (entry.getValue() != maxCount - 1 && entry.getKey() != maxCountNumber) {
                        flagMax = false;
                    }

                }
                if (flagMin) {
                    if(entry.getValue() != maxCount && entry.getKey() != minNumber){
                        flagMin = false;
                    }
                }
            }
            if (flagMax || flagMin) {
                if (i + 1 > answer) {
                    answer = i + 1;
                }
            }
        }
        System.out.println(answer);
    }
}
