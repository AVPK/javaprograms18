package practice;

import java.util.Scanner;

public class Solution {
    static int B; // Breadth of the parallelogram
    static int H; // Height of the parallelogram

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // Read inputs for B and H
        B = scr.nextInt();
        H = scr.nextInt();

        // Validate B and H
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            // Calculate and display area
            int area = B * H;
            System.out.println(area);
        }

        scr.close(); // Close the scanner
    }
}
