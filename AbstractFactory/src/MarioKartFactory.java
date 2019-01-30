
public class MarioKartFactory implements RacingFactory {

	@Override
	public RaceTrack getRaceTrack() {
		
		return new MarioKartTrack();
	}

	@Override
	public Driver getDriver() {
	
		return new MarioKartDriver();
	}

}
