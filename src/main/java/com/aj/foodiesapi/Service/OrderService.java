package com.aj.foodiesapi.Service;

import com.aj.foodiesapi.io.OrderRequest;
import com.aj.foodiesapi.io.OrderResponse;
import com.razorpay.RazorpayException;

import java.util.List;
import java.util.Map;

public interface OrderService {

    OrderResponse createOrderWithPayment(OrderRequest request) throws RazorpayException;

    void verifyPayment(Map<String, String> paymentData, String status);

    List<OrderResponse> getUserOrders();

    void removeOrder(String orderId);

    List<OrderResponse> getOrderOfAllUsers();

    void updateOrderStatus(String orderId, String status);

}
