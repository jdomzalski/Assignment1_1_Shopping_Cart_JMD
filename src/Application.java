/**
 * @author Joshua Domzalski
 * Data Structures
 * This is our Application class where we will test all of the methods for the Shopping Cart
 */
public class Application {

	public static void main(String[] args) {

		/**
		 * Creating a Shopping List that is parameterized with type Item
		 */
		ShoppingCartClass <Item> shoppingList = new ShoppingCartClass<>();
		/**
		 * Adding 5 items to the Shopping List
		 */
		
		ItemClass hat = new ItemClass("Hat", "Clothing", 10.25);
		shoppingList.addItem(hat);
		ItemClass bike = new ItemClass("Bike", "Recreation", 75.00);
		shoppingList.addItem(bike);
		ItemClass basketball = new ItemClass("Basketball", "Sports", 14.99);
		shoppingList.addItem(basketball);
		ItemClass iPhone = new ItemClass("iPhone", "Tech", 799.99);
		shoppingList.addItem(iPhone);
		ItemClass cheese = new ItemClass("Cheese", "Food", 5.55);
		shoppingList.addItem(cheese);	
		/**
		 * Printing out the contents of our Shopping List
		 */
		System.out.println(shoppingList.getContents());
		/**
		 * Printing the current size of the Shopping List
		 */
		System.out.println("Showing the number of items we have added to the Shopping List: "+shoppingList.getCurrentSize() +"\n");
		/**
		 * Removing an item and then printing the current size of the Shopping List (to show that the item got removed)
		 */
		shoppingList.removeItem(iPhone);
		shoppingList.removeItem(bike);
		System.out.println("Showing the number of items in the Shopping List after removing two of the items: "+
		shoppingList.getCurrentSize() + "\n");
		/**
		 * Adding the items we just removed back into the Shopping List and printing the total price of all the items
		 */
		shoppingList.addItem(iPhone);
		shoppingList.addItem(bike);
		System.out.println("The total price of all the items after adding all the items back into the Shopping List: "+
		shoppingList.getTotalPrice() + "\n");
		/**
		 * Testing to see if the Shopping List is empty (it currently has 5 items in it)
		 */
		System.out.println("Testing to see if the Shopping List is empty: "+shoppingList.isEmpty() + "\n");
		/**
		 * Clearing all items out of the Shopping List and checking the current size of the Shopping List as well as checking if 
		 * the Shopping List is empty
		 */
		shoppingList.clear();
		System.out.println("Showing the size of the Shopping List after calling the clear method: "+shoppingList.getCurrentSize() + "\n");
		System.out.println("Testing to see if the Shopping List is empty after calling the clear method: "+shoppingList.isEmpty() + "\n");
		
		/**
		 * Adding 2 basketballs and 1 hat to our Shopping List
		 */
		shoppingList.addItem(hat);
		shoppingList.addItem(basketball);
		shoppingList.addItem(basketball);
		System.out.println("--Added 2 basketballs and 1 hat to the now empty Shopping List--" + "\n");
		/**
		 * Checking to see if our Shopping List contains 3 respective items
		 */
		System.out.println("Checking to see if the Shopping List now contains a hat: "+shoppingList.contains(hat) + "\n");
		System.out.println("Checking to see if the Shopping List now contains a basketball: "+shoppingList.contains(basketball)+ "\n");
		System.out.println("Checking to see if the Shopping List now contains cheese: "+shoppingList.contains(cheese)+ "\n");
		/**
		 * Checking the frequencies of the three items we just checked for
		 */
		System.out.println("Checking the number of hats now in the Shopping List: "+shoppingList.getFrequency(hat)+ "\n");
		System.out.println("Checking the number of basketballs now in the Shopping List: "+shoppingList.getFrequency(basketball)+ "\n");
		System.out.println("Checking the number of cheese now in the Shopping List: "+shoppingList.getFrequency(cheese)+ "\n");
		
		System.out.println("All methods from Shopping Cart Class tested."+"\n");
		/**
		 * Printing final contents of Shopping List
		 */
		System.out.println(shoppingList.getContents());
		

	}//end main

}//end class
