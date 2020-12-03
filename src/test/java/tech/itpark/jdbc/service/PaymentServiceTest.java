package tech.itpark.jdbc.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    @Test
    void shouldCalculateForSinglePayment(){
        final var service = new PaymentService();
        final var price = 800;
        final var months = 1;
        final var expected = List.of(800);

        final var actual = service.calculate(price, months);
        assertEquals(expected, actual);
    }

//    TODO: 12:48

}