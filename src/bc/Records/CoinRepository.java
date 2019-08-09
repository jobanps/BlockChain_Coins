package bc.Records;

import java.util.ArrayList;

public class CoinRepository {

	ArrayList<User> userlist = new ArrayList<User>();

	public CoinRepository(User rootUser) {
		this.userlist.add(rootUser);
	}

	//display all user and coin details
	public void showRecord() {

		for (int i = 0; i < userlist.size(); i++) {
			User usr = userlist.get(i);
			System.out.println("\nUser " + (i + 1));
			System.out.println("User Id : " + usr.getUserId());
			System.out.println("User Name : " + usr.getUserName());
			System.out.println("Number of Coins Won : " + usr.getNumberOfCoin());
			System.out.println("Nonsense Coins Follows : ");
			for (int j = 0; j < usr.getNumberOfCoin(); j++) {
				System.out.println("Nonsense Coin '" + (j + 1) + "' : [" + usr.getMyCoins().get(j).getHashCode() + "]");
			}
		}
	}

	public User getUserById(int id) {

		for (User user : userlist) {
			if (user.getUserId() == id) {
				return user;
			}
		}
		return null;
	}

	public void addUserData(User userData) {
		this.userlist.add(userData);

	}

	public ArrayList<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(ArrayList<User> userlist) {
		this.userlist = userlist;
	}

}
