package bc.Records;

import java.util.ArrayList;

import bc.blockchain.Block;

public class User {

	private String userName;
	private int userId;
	private int numberOfCoin;
	private ArrayList<Block> myCoins = new ArrayList<Block>();

	// User class's Constructor
	public User(String userName, int userId, Block myCoins) {
		this.userName = userName;
		this.userId = userId;
		this.numberOfCoin = 0;
		this.myCoins.add(myCoins);
	}

	public User(String userName, int userId) {
		this.userName = userName;
		this.userId = userId;
		this.numberOfCoin = 0;
	}

	// Add new Block to user
	public void addNewCoin(Block coin) {
		this.myCoins.add(coin);
	}

	// Getter and Setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public ArrayList<Block> getMyCoins() {
		return myCoins;
	}

	public void setMyCoins(ArrayList<Block> myCoins) {
		this.myCoins = myCoins;
	}

	public int getNumberOfCoin() {
		this.numberOfCoin = this.myCoins.size();
		return numberOfCoin;
	}

	public void setNumberOfCoin(int numberOfCoin) {
		this.numberOfCoin = numberOfCoin;
	}

}
