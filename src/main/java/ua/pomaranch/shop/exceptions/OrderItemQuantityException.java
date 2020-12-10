package ua.pomaranch.shop.exceptions;

public class OrderItemQuantityException extends RuntimeException{
    public OrderItemQuantityException(String message) {
        super(message);
    }
}
