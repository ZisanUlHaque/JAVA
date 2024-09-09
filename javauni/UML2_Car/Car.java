
package UML2_Car;


public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Public method to start the car
    public void start() {
        System.out.println("The car has started.");
    }

    // Public method to stop the car
    public void stop() {
        System.out.println("The car has stopped.");
    }

    // Public method to drive the car at a specified speed
    public void drive(int speed) {
        System.out.println("The car is driving at " + speed + " km/h.");
    }
    
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public static void main(String ar[]){
        Car c = new Car("Tyota","Camry",2023);
        
        System.out.println("Car Details:");
        System.out.println("Make: "+c.getMake());
        System.out.println("Model: "+c.getModel());
        System.out.println("Make: "+c.getYear());
        
        c.start();
        c.drive(60);
        c.stop();
    }
}
