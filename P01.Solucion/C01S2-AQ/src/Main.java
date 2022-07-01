public class Main {

	/*
	 * Solución por polimorfismo.
	 * Se crea una interfaz IMovie que tiene los métodos necesarios.
	 * No tiene posibilidad de que una película cambie de categoría dinámicamente y no puede componer categorías.
	 */
	
	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");
		
		IMovie hotFuzz = new NewRelease("Hot Fuzz");
		IMovie toyStory = new Childrens("Toy Story");
		IMovie zombiesParty = new Regular("Zombies Party");

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
