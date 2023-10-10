package th.Vehicle;

public class Car extends Vehicle{
    public Car(String brand, String color) {
        super(brand, color);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
