package com.zuitt.app;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double temp) {
        return (temp * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double temp) {
        return (temp - 32) * 5/9;
    }
}
