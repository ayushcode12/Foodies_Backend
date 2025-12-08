package com.aj.foodiesapi.Service;

import com.aj.foodiesapi.io.CartRequest;
import com.aj.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);

}
