package CeilingFan;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiated remote controller
        RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
        CeilingFan ceilingFan=new CeilingFan("Bedroom");
        //Here, high, middle and low speed shutdowns are instantiated separately
        CeilingFanHighCommand highCommand=new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand mediumCommand=new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand offCommand=new CeilingFanOffCommand(ceilingFan);
        
        //Opening and closing methods of middle and high speed remote control loading
        remoteControl.setCommand(0, mediumCommand, offCommand);
        remoteControl.setCommand(1, highCommand, offCommand);
        //Open the ceiling fan at medium speed first
        remoteControl.onButtonWasPushed(0);
        //Close ceiling fan
        remoteControl.offButtonWasPushed(0);
        //Display slot call information
        System.out.println(remoteControl.toString());
        //Revocation, it's going to be medium speed.
        remoteControl.undoButtonWasPushed();
        
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPushed();    
		
	}

}
