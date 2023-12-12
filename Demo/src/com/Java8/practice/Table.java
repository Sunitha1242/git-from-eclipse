package com.Java8.practice;

import java.util.function.Predicate;

// Print a table for a given number using Java8
@FunctionalInterface
interface TablePrinter {
    void printRow(int number, int multiplier, int result);
}

public class Table {
    public static void main(String[] args) {
        int number = 7; // Change this to the desired number for the table

        // Define a lambda expression that implements the TablePrinter interface
        TablePrinter tablePrinter = (n, m, r) ->
            System.out.println(n + " x " + m + " = " + r);

;        // Generate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            tablePrinter.printRow(number, i, result);
        }
    }
}

