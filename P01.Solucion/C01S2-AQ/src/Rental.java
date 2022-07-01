public class Rental		// Alquiler 
{
	private IMovie movie;
	private int days;
	
	public Rental(IMovie movie, int days) 
	{
		this.movie = movie;
		this.days = days;
	}

	public int getDays() 
	{
		return days;
	}

	public IMovie getMovie() 
	{
		return movie;
	}

	double getPrice() {
		return movie.getPrice(this);
	}

	int getPoints() {
		return movie.getPoints(this);
	}
}
