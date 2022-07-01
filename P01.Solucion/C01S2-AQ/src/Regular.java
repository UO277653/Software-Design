
public class Regular implements IMovie {
	private String title;

	public Regular(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public double getPrice(Rental rental) {
		double price = 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		return 1;
	}

	@Override
	public String getCategory() {
		return "Regular";
	}

}
