package bc.blockchain;

import java.util.Scanner;

import bc.Records.CoinRepository;
import bc.Records.User;
import bc.nonsensecoins.NonsenseCoin;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter data for Genesis Block : ");
		String data = input.next();
		System.out.println("Creating Root Owner for Genesis Block !");
		System.out.println("Enter user Id for Root User : ");
		int id = input.nextInt();
		System.out.println("Enter Name of Root User : ");
		String name = input.next();
		NonsenseCoin nonsenseCoinChain = new NonsenseCoin(data);

		CoinRepository coinRecord = new CoinRepository(new User(name, id, nonsenseCoinChain.getBlockChain().get(0)));

		boolean continueMining = true;

		int choice;

		do {

			System.out.println(
					"\nChoose Option !!\n1.Mine Chain\n2.View Nonsense Coin Chain\n3.Validate Nonsense Coin Chain\n4.Show Coin Record\n5.Exit\n\n Choose option : ");

			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter User Id who wants to Min : ");
				int idMine = input.nextInt();
				User user = coinRecord.getUserById(idMine);
				if (user == null) {
					System.out.println("\nUser Doesnot exist, Please enter new details to create User");
					System.out.println("Enter user Id for New User : ");
					id = input.nextInt();
					System.out.println("Enter Name of new User : ");
					name = input.next();
					user = new User(name, id);
					coinRecord.addUserData(user);
				}
				System.out.println("Enter Data for next Coin : ");
				data = input.next();
				Block block1 = nonsenseCoinChain.mineNonsenseCoin(data, user.getUserName());
				user.addNewCoin(block1);
				break;
			case 2:
				nonsenseCoinChain.viewChain();
				break;
			case 3:
				nonsenseCoinChain.validateBlockChain();
				break;
			case 4:
				coinRecord.showRecord();
				break;
			case 5:
				continueMining = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (continueMining);

		System.out.println("Thank for Using NonsenseCoin Tool !!");
		input.close();
	}

}
