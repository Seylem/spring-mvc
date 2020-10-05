package web.model;

public class Car {
    private static String brand;
    private static String color;
    private static int power;

    public Car(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Car.color = color;
    }

    public static int getPower() {
        return power;
    }

    public static void setPower(int power) {
        Car.power = power;
    }

    @Override
    public String toString() {
        return brand + " " + color + " " + power + "\n";
    }
}
