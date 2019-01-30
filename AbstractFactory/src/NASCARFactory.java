
public class NASCARFactory implements RacingFactory {

	@Override
	public RaceTrack getRaceTrack() {
		
		return new NASCARTrack();
	}

	@Override
	public Driver getDriver() {
	
		return new NASCARDriver();
	}

}
