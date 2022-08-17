package info.shkryl.bean;

public class Employee {
    private Car car;
    private House house;
    private Pet pet;

    public Employee(Car car, House house, Pet pet) {
        this.car = car;
        this.house = house;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "car=" + car +
                ", house=" + house +
                ", pet=" + pet +
                '}';
    }
}
