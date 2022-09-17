/**
 * @author Joshua Domzalski
 * This is an interface that describes the methods of an Item
 */
public interface Item {

	/**
	 * Gets the name of the item
	 * @return
	 */
	public String getName();
	/**
	 * Gets the type of the item
	 * @return
	 */
	public String getType();
	/**
	 * Gets the price of the item
	 * @return
	 */
	public double getPrice();
	
	
}//end interface
