
public class NASCARDriver extends Driver{
	private String name = "LightningMquean";
	private int speed = 100;
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
