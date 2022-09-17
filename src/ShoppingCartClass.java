/** 
 * @author Joshua Domzalski
 * This is a ShoppingCartClass that implements the method from the ShoppingCart interface
 * @param <T>
 */
public class ShoppingCartClass<T> implements ShoppingCart {
	
	/**
	 * Variable declaration (Creating a ResizableArrayBag object that is parameterized with type Item)
	 */
	ResizableArrayBag<Item> myBag;
	ItemClass item;
	float totalPrice;
	
	/**
	 * Preferred constructor
	 */
	public ShoppingCartClass() {
	myBag = new ResizableArrayBag();
	item = new ItemClass();
	}
	
	/**
	 * Method that allows us to add a passed in Item to our list
	 */
	@Override
	public boolean addItem(Item t) {
		return myBag.add((ItemClass) t);
	}
	/**
	 * Method that allows us to remove a passed in Item from our list
	 */
	@Override
	public boolean removeItem(Item t) {
		return myBag.remove((ItemClass) t);
	}
	public T remove() {
		return (T) myBag.remove();
	}
	/**
	 * Method that gets the Current Size of our list
	 */
	@Override
	public int getCurrentSize() {
		return myBag.getCurrentSize();
	}
	/**
	 * Method that iterates through our list and returns the total price of all the items in the list
	 */
	@Override
	public double getTotalPrice() {
		Object[] localShoppingCart = myBag.toArray();
		double sum = 0;
		Item anItem;
		for(Object i: localShoppingCart) {
			anItem = (Item)i;
			sum = sum + anItem.getPrice();
		}
		return sum;
		}
	
	/**
	 * Method that checks to see if our list is empty or not
	 */
	@Override
	public boolean isEmpty() {
		return myBag.isEmpty();
	}
	/**
	 * Method that clears all items from the list
	 */
	@Override
	public T clear() {
		myBag.clear();
		return null;
	}

	/**
	 * Method that checks how many times a given item occurs in the list
	 */
	@Override
	public int getFrequency(ItemClass a) {
		return myBag.getFrequencyOf(a);

	}
	/**
	 * Method that checks to see if a given item is in our list
	 */
	@Override
	public boolean contains(ItemClass a) {
		return myBag.contains(a);
	}

	/**
	 * toArray method
	 */
	@Override
	public Object[] toArray() {
		return myBag.toArray();
	}
	
	
	public Item getContents() {
		
		Object[] aItem = myBag.toArray();
		Item anItem = null;
		System.out.println("Items currently in bag: "+"\n");
		for(Object i: aItem) {
			anItem = (ItemClass) i;
			
			System.out.println(("Name of Item: ")+anItem.getName()+"\n");
			System.out.println(("Type of Item: ")+anItem.getType()+"\n");
			System.out.println(("Price of Item: ")+anItem.getPrice()+"\n");
		}
		return null;
		
	}
}

//end class
