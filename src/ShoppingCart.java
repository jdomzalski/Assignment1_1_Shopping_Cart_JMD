/**
 * @author Joshua Domzalski
 * This is an interface that describes the methods of a ShoppingCart
 * @param <T>
 */
public interface ShoppingCart<T> {
	
	/**
	 * Adds an Item to the Shopping Cart
	 * @param t
	 * @return
	 */
	public boolean addItem(Item t);
	/**
	 * Removes an Item from the Shopping Cart
	 * @param t
	 * @return
	 */
	public boolean removeItem(Item t);
	/**
	 * Gets the current size of the number of items currently in the Shopping Cart
	 * @return
	 */
	public int getCurrentSize();
	/**
	 * Gets the total price of all the items currently in the Shopping Cart
	 * @return
	 */
	public double getTotalPrice();
	/**
	 * Checks to see if the Shopping Cart is empty or not
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * Clears all the items in the Shopping Cart
	 * @return
	 */
	public T clear();
	/**
	 * Checks the number of a specific type of item currently in the Shopping Cart
	 * @return
	 */
	public int getFrequency(ItemClass a);
	/**
	 * See if the Shopping Cart contains a specific type of item
	 * @return
	 */
	public boolean contains(ItemClass a);
	/**
	 * Returns an array of the items in the shopping cart, as well as the respective price for each item
	 * @return
	 */
	public T[] toArray();
	
	
	
}//end interface
