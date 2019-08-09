package bc.blockchain;

import java.util.Scanner;

import bc.nonsensecoins.NonsenseCoin;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter data for Genesis Block : ");
		String data = input.nextLine();

		NonsenseCoin nonsenseCoinChain = new NonsenseCoin(data);

		boolean continueMining = true;

		int choice;

		do {

			System.out.println(
					"\nChoose Option !\n1.Mine Chain\n2.View Nonsense Coin Chain\n3.Validate Nonsense Coin Chain\n4.Exit\n\n Choose option : ");

			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Data for next Coin : ");
				data = input.next();
				nonsenseCoinChain.mineNonsenseCoin(data);
				break;
			case 2:
				nonsenseCoinChain.viewChain();
				break;
			case 3:
				nonsenseCoinChain.validateBlockChain();
				break;
			case 4:
				continueMining = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (continueMining);

		System.out.println("Thank for Using NonsenseCoin Tool !!");
	}

}
