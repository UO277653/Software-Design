
public class Childrens implements IMovie {
	private String title;

	public Childrens(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public double getPrice(Rental rental) {
		double price = 1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		return 1;
	}

	@Override
	public String getCategory() {
		return "Childrens";
	}

}
