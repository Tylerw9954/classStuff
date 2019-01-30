
public class Racing {
public static void go(RacingFactory factory) {
	RaceTrack track = factory.getRaceTrack();
	System.out.printf("Our drivers are ");
	for(int i = 0; i<3; i++) {
		Driver driver = factory.getDriver();
		System.out.printf("%s%s%s", i<2? "" : " and ", driver.getName(), i<1? ", " : "");
		track.add(driver);
	}
	System.out.printf("...ready...set...go!%n");
	Driver winner = track.compete();
	System.out.printf("The winner of the '%s' race is %s!%n", track.getName(), winner.getName());
}
}
