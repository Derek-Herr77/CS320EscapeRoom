package controller;

import java.util.ArrayList;
import java.util.List;

import persist.DatabaseProvider;
import persist.DerbyDatabase;
import persist.IDatabase;
import model.Author;

public class DatabaseLogic {

	private IDatabase db = null;

	public DatabaseLogic() {
		
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
	}

	public int getRoom() {
		
		// get the list of (Author, Book) pairs from DB
		int room = db.getRoom();

		System.out.println("The call from the class is: " + room);
		// return authors for this title
		return room;
	}
	
	public void setRoom(int room) {
		//set the room from the given room number
		db.setRoom(room);
	}
	
	public String getPlayerInv() {
		String inv = db.getPlayerInv();
		System.out.println("Player inv: " + db.getPlayerInv());
		return inv;
	}
	
	public void addItemToPlayerInv(String item) {
		db.addItemToPlayerInv(item);
		System.out.println("Inv after adding +" + item + ": " + db.getPlayerInv());
	}
	
	public void removeItemFromPlayerInv(String item) {
		db.removeItemFromPlayerInv(item);
		System.out.println("Inv after removing +" + item + ": " + db.getPlayerInv());
	}
	
	public String getActions() {
		String actions = db.getActions();
		System.out.println("Player actions: " + db.getActions());
		return actions;
	}
	
	public void addAction(String action) {
		db.addAction(action);
		System.out.println("actions after adding" + action + ": " + db.getPlayerInv());
	}
	
	public void remvoveAction(String action) {
		db.removeAction(action);
		System.out.println("actions after removing" + action + ": " + db.getPlayerInv());
	}
}
