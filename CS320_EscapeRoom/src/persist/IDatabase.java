package persist;

import java.util.List;


import model.Coordinate;


public interface IDatabase {
	public int getRoom();
	public void setRoom(int room);
	
	//functions for the player inventory
	public String getPlayerInv();
	public void addItemToPlayerInv(String item);
	public void removeItemFromPlayerInv(String item);
	public void updatePlayerInv(String inv);
	
	//functions for actions
	public String getActions();
	public void addAction(String action);
	public void removeAction(String action);
	public void updateActions(String actions);
	
	//functions for the map inventory
	public String getMapInventory();
	public void addToMapInventory(String item, String Coordinate);
	public void removeFromMapInventory(String item);
	public void setMapInventory(String mapInventory);
	
	//log functions
	public List<String> getLog();


	
	//functions for the x/y of the player
	public int getCoordinateX();
	public int getCoordinateY();
	public void setCoordinate(Coordinate coord);

	public List<String> addLog(String line);


}
