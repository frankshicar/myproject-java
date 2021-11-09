package com.frank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        System.out.print("Please enter mun:");
        Scanner scanner = new Scanner( System.in);
        String a = scanner.next();
        int lon = Integer.parseInt(a);
        for (int i = 0; i <= lon; i++) {
            for (int n = 0; n <= lon; n++) {
                if (i == 0 || i == lon) {
                    System.out.print("*");
                }
                else if (i == 1 || i == lon-1) {
                    if (n == 0 || n == lon)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (n == 1 || n == lon-1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}