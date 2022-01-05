package com.maxprogrammer.application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();

        System.out.println("------------------------");
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int number = sc.nextInt();
            cursoA.add(number);
        }

        System.out.println("------------------------");
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int number = sc.nextInt();
            cursoB.add(number);
        }

        System.out.println("------------------------");
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            int number = sc.nextInt();
            cursoC.add(number);
        }

        Set<Integer> total = new HashSet<>(cursoA);
        total.addAll(cursoB);
        total.addAll(cursoC);

        System.out.println("------------------------");
        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
