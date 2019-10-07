package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.information.MailService;
import com.kodilla.good.patterns.challenges.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.order.OrderRequest;
import com.kodilla.good.patterns.challenges.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.repository.CarOrderRepository;
import com.kodilla.good.patterns.challenges.service.CarOrderService;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new CarOrderService(), new CarOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
