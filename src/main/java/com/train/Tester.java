package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        // scan total ticket count
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();

        // scan round-trip ticket count
        System.out.print("How many round-trip tickets: ");
        int roundTripCount = scanner.nextInt();

        // calculate one-way ticket count
        int oneWayCount = totalCount - roundTripCount;

        // generate order
        Order order = new Order(oneWayCount, roundTripCount);

        // print receipt
        order.printReceipt();
    }
}
