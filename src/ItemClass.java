/**
 * @author Joshua Domzalski
 * This is the ItemClass that is implementing the methods from the interface Item\
 * Data Structures
 * @param <T>
 */
public class ItemClass<T> implements Item {
	
	/**
	 * Variable declaration
	 */
	private String name;
	private String type;
	private double price;
	
	/**
	 * Empty-argument constructor
	 */
	public ItemClass() {
		this.name = " ";
		this.type = " ";
		this.price = (float) 0.0;
	}
	/**
	 * Preferred constructor
	 * @param name
	 * @param type
	 * @param price
	 */
	public ItemClass(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	/**
	 * Implemented methods from Item Interface
	 */
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {	
		return type;
	}

	@Override
	public double getPrice() {
		return price;
	}

} //end class

