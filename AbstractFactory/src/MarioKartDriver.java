
public class MarioKartDriver extends Driver{
	private String name = "Baby Mario";
	private int speed = 10;
	private int dist;
	@Override
String getName() {
	return this.name;
}
	@Override
int getSpeed() {
	return this.speed;
}
	@Override
void resetDistance() {
	dist = 0;//????
}
	@Override
int getDistance() {
	return this.dist;
}
void advance() {
	//dolatter
}
}
