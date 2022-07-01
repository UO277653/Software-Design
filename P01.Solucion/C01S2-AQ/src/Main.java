public class Main {

	/*
	 * Soluci�n por polimorfismo.
	 * Se crea una interfaz IMovie que tiene los m�todos necesarios.
	 * No tiene posibilidad de que una pel�cula cambie de categor�a din�micamente y no puede componer categor�as.
	 */
	
	public static void main(String[] args) {

		Customer raul = new Customer("Ra�l");
		
		IMovie hotFuzz = new NewRelease("Hot Fuzz");
		IMovie toyStory = new Childrens("Toy Story");
		IMovie zombiesParty = new Regular("Zombies Party");

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
