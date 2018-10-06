
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		String mustang = "mustang";
		int positionInRace = 5;
		// 1. Create a RaceCar and place it in 5th position
		RaceCar racecar = new RaceCar(mustang, positionInRace);
		// 2. Print the RaceCar's position in the race
		System.out.println(positionInRace + "th place");
		// 3. Crash the RaceCar
		racecar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		racecar.isDamaged();
		racecar.pit();
		// 5. Help the car move into first place.
		for (int i = 0; i <= 6; i++) {
			racecar.overtake();
		}

	}
}
