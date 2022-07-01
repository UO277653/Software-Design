
public interface IMovie {
	String getTitle();
	double getPrice(Rental rental);
	int getPoints(Rental rental);
	String getCategory();
}
