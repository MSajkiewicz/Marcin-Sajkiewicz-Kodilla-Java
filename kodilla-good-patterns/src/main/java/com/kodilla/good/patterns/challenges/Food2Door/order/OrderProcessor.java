package com.kodilla.good.patterns.challenges.Food2Door.order;

import com.kodilla.good.patterns.challenges.Food2Door.informationService.InformationService;
import com.kodilla.good.patterns.challenges.Food2Door.orderRepository.OrderRepository;
import com.kodilla.good.patterns.challenges.Food2Door.orderService.OrderService;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto orderProcess(final Order order) {
        boolean isOrdered = orderService.createOrder(order);
        if (isOrdered) {
            informationService.inform(order.getSupplier().getMessage());
            orderRepository.addToRepository(order);
            order.getSupplier().process(order);
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}
