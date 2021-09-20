package CeilingFan;

public class CeilingFanHighCommand implements Command{
	
	CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    // implement
    public void execute() {
        // Before executing the method, get the previous state and record it.
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    // Revoke
    public void undo() {
        // Set the fan speed to the previous state to achieve the purpose of revocation
        switch (prevSpeed) {
        case CeilingFan.HIGH:
            ceilingFan.high();
            break;
        case CeilingFan.MEDIUM:
            ceilingFan.medium();
            break;
        case CeilingFan.LOW:
            ceilingFan.low();
            break;
        case CeilingFan.OFF:
            ceilingFan.off();
            break;
        }
    }

}
