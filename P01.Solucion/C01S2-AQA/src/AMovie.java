
public abstract class AMovie implements IMovie {
	private String title;

	public AMovie(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
