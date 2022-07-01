
public class NewRelease implements IMovie {
	private String title;
	
	public NewRelease(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public double getPrice(Rental rental) {
		return rental.getDays() * 3;
	}

	@Override
	public int getPoints(Rental rental) {
		int points = 1;
		if (rental.getDays() > 1)
			points = 2;
		return points;
	}

	@Override
	public String getCategory() {
		return "New Release";
	}

}
