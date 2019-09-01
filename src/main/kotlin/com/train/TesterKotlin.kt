package com.train

import java.util.*

fun main() {
    // scan total ticket count
    print("Please enter number of tickets: ")
    val scanner = Scanner(System.`in`)
    val totalCount = scanner.nextInt()

    // scan round-trip ticket count
    print("How many round-trip tickets: ")
    val roundTripCount = scanner.nextInt()

    // calculate one-way ticket count
    val oneWayCount = totalCount - roundTripCount

    // generate order
    val order = OrderKotlin(oneWayCount, roundTripCount)

    // print receipt
    order.printReceipt()
}

class OrderKotlin(var ticketCountOfOneWay: Int, var ticketCountOfRoundTrip: Int) {
    fun printReceipt() {
        val totalTicketCount = ticketCountOfOneWay + ticketCountOfRoundTrip
        val totalAmount =
            (ticketCountOfOneWay * TicketKotlin.ONE_WAY_PRICE) + (ticketCountOfRoundTrip * TicketKotlin.ROUND_TRIP_PRICE)
        println("Total tickets: $totalTicketCount")
        println("Round-trip: $ticketCountOfRoundTrip")
        println("Total: $totalAmount")
    }
}

class TicketKotlin() {
    companion object {
        const val ONE_WAY_PRICE = 1000;
        const val ROUND_TRIP_PRICE = 2000 / 10 * 9;
    }
}