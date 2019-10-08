package com.kodilla.good.patterns.challenges.challenge1;

import com.kodilla.good.patterns.challenges.challenge1.information.MailService;
import com.kodilla.good.patterns.challenges.challenge1.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.challenge1.order.OrderRequest;
import com.kodilla.good.patterns.challenges.challenge1.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.challenge1.repository.CarOrderRepository;
import com.kodilla.good.patterns.challenges.challenge1.service.CarOrderService;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new CarOrderService(), new CarOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
