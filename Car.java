package sit.model;
public class Car extends MotorVehicle{
    private int carWheel;
    private int carSeat;

    public Car(int carWheel, int carSeat, String motorType, int motorEngine, int motorAge, String motorName) {
        super(motorType, motorEngine, motorAge, motorName);
        this.carWheel = carWheel;
        this.carSeat = carSeat;
    }
    
    public int getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(int carWheel) {
        this.carWheel = carWheel;
    }

    public int getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(int carSeat) {
        this.carSeat = carSeat;
    }

    public double motorTax(){
        if(getMotorAge()<6){
            if(getMotorEngine()>0 || getMotorEngine()<=600){
                super.tax = getMotorEngine()*0.5;
            }else if(getMotorEngine()>600 || getMotorEngine()<=1800){
                super.tax = (getMotorEngine()*1.5);
            }else if(getMotorEngine()>1800){
                super.tax = (getMotorEngine()*4);
            }
        }else if(getMotorAge()>6){
            if(getMotorEngine()>0 || getMotorEngine()<=600){
                super.tax = (getMotorEngine()*0.5)-((getMotorEngine()*0.5)*0.1);
            }else if(getMotorEngine()>600 || getMotorEngine()<=1800){
                super.tax = (getMotorEngine()*1.5)-((getMotorEngine()*1.5)*0.1);
            }else if(getMotorEngine()>1800){
                super.tax =  (getMotorEngine()*4)-((getMotorEngine()*4)*0.1);
            }
        }
        return super.tax;
        
    }
    
    @Override
    public String toString() {
        return "Car{" +super.toString()+ "carWheel=" + carWheel + ", carSeat=" + carSeat + " Tax "+motorTax()+'}';
    }
    
    
}
