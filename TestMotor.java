package sit.view;

import sit.model.Car;
import sit.model.MotorVehicle;

public class TestMotor {

    public static void main(String[] args) {
        MotorVehicle m1 = new MotorVehicle ("Car", 1500, 2, "Honda");
        System.out.println(m1);
        
        Car honda = new Car (4, 5, "PickUp", 1600, 4, "Fiesta");
        System.out.println(honda);
        
        Car bmw = new Car(4,4,"Sport",1600,2,"Fiesta");
        System.out.println(bmw);
        
        System.out.println(m1.equals(honda));
        System.out.println(honda.equals(bmw));
    }
}
