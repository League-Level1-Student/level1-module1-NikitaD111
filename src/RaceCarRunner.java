

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar racecar = new RaceCar("McLaren", 5);
		// 2. Print the RaceCar's position in the race
racecar.getPositionInRace();
		// 3. Crash the RaceCar
		racecar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
racecar.pit();
		// 5. Help the car move into first place.
for (int i = 0; racecar.getPositionInRace() > 1; i++) {
racecar.overtake();
}
	}
}
