import java.util.ArrayList;

public class CarStore {
    private ArrayList<Car> cars;
    private double discount;

    public CarStore() {
        cars = new ArrayList<Car>();
        cars.add(new Lamborghini("Veneno", 8300000));
        cars.add(new Lamborghini("Sian", 3600000));
        cars.add(new Lamborghini("Miura SVJ", 3600000));
        cars.add(new Ferrari("250 GTO", 70000000));
        cars.add(new Ferrari("335 Sport Scaglietti", 34200000));
        cars.add(new Ferrari("290 MM Spider Scaglietti", 28000000));
        cars.add(new Bugatti("1936 Atlantic", 13000000));
        cars.add(new Bugatti("Centodieci", 14000000));
        cars.add(new Bugatti("La Voiture Noire", 12000000));
        discount = 0;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void applyDiscount() {
        discount += 0.1;
    }

    public void sellCar(Car car) {
        cars.remove(car);
    }
}