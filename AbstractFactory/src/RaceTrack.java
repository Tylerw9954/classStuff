import java.util.ArrayList;

public abstract class RaceTrack{
	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	private String name;
	private int length;
String getName() {
	return this.name;
}
int getLength() {
	return this.length;
}
void add(Driver...drivers) {
	for(int x =0; x < drivers.length; x++) {//maybe change the condition if no work
		this.drivers.add(drivers[x]);
	}

}

public Driver compete() {
	
	for(Driver d : drivers ) {
		d.resetDistance();
	}
	Driver winner = null;
	while(winner == null) {
		for(Driver d : drivers) {
			d.advance();
			if(d.getDistance() > length) {
				winner = d;

			break;
			}
	}
}
	return winner;
}
}
