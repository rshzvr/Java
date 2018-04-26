package strategies;
import automail.Clock;
import automail.MailItem;
import automail.PriorityMailItem;
import automail.StorageTube;
import strategies.IRobotBehaviour.RobotState;

public class WeakRobotBehaviour implements IRobotBehaviour {
	
	private boolean strong;
	private int newPriority; // Used if we are notified that a priority item has arrived. 
		
	public WeakRobotBehaviour() {
		//this.strong = strong;
		newPriority = 0;
	}	
	@Override
	public void startDelivery() {
		newPriority = 0;
	}
	
	@Override
    public void priorityArrival(int priority, int weight) {
		newPriority = 0;
    	//if (priority > newPriority) newPriority = priority;  // Only the strong robot will deliver priority items so weight of no interest
    }
	
	@Override
	public boolean returnToMailRoom(StorageTube tube) {
		return false;
		/*
		if (tube.isEmpty()) {
			return false; // Empty tube means we are returning anyway
		} else {
			// Return true for the strong robot if the one waiting is higher priority than the one we have
			// Assumes that the one at the top of the tube has the highest priority
			return strong && newPriority > tubePriority(tube);
		}*/
	}
	public void changeState(RobotState nextState) {
		//empty method. 
	}
	
}
