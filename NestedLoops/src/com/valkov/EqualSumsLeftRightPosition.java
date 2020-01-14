package com.valkov;

import java.util.Scanner;

public class EqualSumsLeftRightPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());


        for (int a = one; a <= two; a++) {
            int left = 0;
            int middle = 0;
            int right = 0;

            for (int b = 0; b <= Integer.toString(a).length() - 1; b++) {
                int num = Integer.toString(a).charAt(b) - 48;

                if (b <= 1) {
                    left += num;
                } else if (b >= 3){
                    right += num;
                }else {
                    middle += num;
                }

            }
            if (left == right || (Math.min(left, right) + middle == Math.max(left, right))) {
                System.out.printf("%d ", a);
            }

        }
    }
}