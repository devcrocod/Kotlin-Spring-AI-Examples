package io.github.devcrocod.example.playground.client

import com.vaadin.flow.server.auth.AnonymousAllowed
import com.vaadin.hilla.BrowserCallable
import io.github.devcrocod.example.playground.services.BookingTools
import io.github.devcrocod.example.playground.services.FlightBookingService

@BrowserCallable
@AnonymousAllowed
class BookingService(private val flightBookingService: FlightBookingService) {

    fun getBookings(): List<BookingTools.BookingDetails> =
        flightBookingService.getBookings()
}