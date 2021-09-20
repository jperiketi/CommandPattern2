package CeilingFan;

public class CeilingFan {
	
	public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    // High speed
    public void high() {
        speed = HIGH;
        System.out.println(location+"Fans are running at high speeds");
    }

    // Medium speed
    public void medium() {
        speed = MEDIUM;
        System.out.println(location+"The fan is running at medium speed.");
    }

    // Low rotational speed
    public void low() {
        speed = LOW;
        System.out.println(location+"Fans are running at low speeds");
    }

    // Close ceiling fan
    public void off() {
        speed = OFF;
        System.out.println(location+"Fan off");
    }
    
    //Get the current ceiling fan speed
    public int getSpeed(){
        return speed;
    }

}
