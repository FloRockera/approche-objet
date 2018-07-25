package exercices;

public class DistanceCalculator {

	public Distance calculeDistance(Point a, Point b){
		double value = (b.getX() - a.getX())*(b.getX() - a.getX()) + (b.getY() - a.getY())*(b.getY() - a.getY());
		return new Distance(Math.sqrt(value));
	}
}