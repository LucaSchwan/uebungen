/**
 * Das Objekt Produkt beinhaltet Name so wie Verfügbarkeit eines Produktes.
 * Die Verfügbarkeit ist vom Monat abhänig und per boolean Array oder String anzugeben. 
 * 
 * @author Luca Schwan, Robert Joel
 * @version 1.0
 * @since 08-12-2020
 * 
*/

class Product {
	private String name;
	private boolean[] regionalAvailability = new boolean[12];
	private boolean[] importAvailability = new boolean[12];
	
	public Product(String name, boolean[] regionalAvailability, boolean[] importAvailability) {
		this.name = name;
		this.regionalAvailability = regionalAvailability;
		this.importAvailability = importAvailability;
	}

	public Product(String name, String regionalAvailability, String importAvailability) {
		this.name = name;
		this.regionalAvailability = BooleanStringHelper.parse(regionalAvailability, '1');
		this.importAvailability = BooleanStringHelper.parse(importAvailability, '1');
	}

	public String getName() {
		return this.name;
	}

	public String stringifyIsRegional() {
		return BooleanStringHelper.stringify(this.regionalAvailability, 'R', ' ');
	}

	public String stringifyIsImported() {
		return BooleanStringHelper.stringify(this.importAvailability, 'I', ' ');
	}
}
