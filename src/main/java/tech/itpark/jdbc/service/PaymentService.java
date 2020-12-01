package tech.itpark.jdbc.service;

import java.util.LinkedList;
import java.util.List;

public class PaymentService {
    public List<Integer> calculate(int price, int months) {
        int payment = price / months;
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < months - 1; i++) {
            result.add(payment);
        }

        result.add(price - payment * (months - 1));
        return result;

    }
}
