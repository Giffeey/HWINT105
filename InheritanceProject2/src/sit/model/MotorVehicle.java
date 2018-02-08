package sit.model;
public class MotorVehicle {
    private String motorType;
    private int motorEngine;
    private int motorAge;
    private String motorName;
    protected double tax;

    public MotorVehicle() {
        this(null, 0, 0, null);
    }

    public MotorVehicle(String motorType, int motorEngine, int motorAge, String motorName) {
        this.motorType = motorType;
        this.motorEngine = motorEngine;
        this.motorAge = motorAge;
        this.motorName = motorName;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getMotorEngine() {
        return motorEngine;
    }

    public void setMotorEngine(int motorEngine) {
        this.motorEngine = motorEngine;
    }

    public int getMotorAge() {
        return motorAge;
    }

    public void setMotorAge(int motorAge) {
        this.motorAge = motorAge;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public double motorTax(){
        return tax;
    }
    
    @Override
    public String toString() {
        return "MotorVehicle{" + "motorType=" + motorType + ", motorEngine=" + motorEngine + ", motorAge=" + motorAge + ", motorName=" + motorName + '}';
    }
    
    
    
}
    

