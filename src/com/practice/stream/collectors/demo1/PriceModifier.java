package com.practice.stream.collectors.demo1;

@FunctionalInterface
public interface PriceModifier {
	double apply(double originalPrice);
}
