package com.example.rockpaperscissors;

public class ShapeStrategy implements PlayStrategy {

    private final Shape shape;

    public ShapeStrategy(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Shape playShape() {
        return shape;
    }
}
