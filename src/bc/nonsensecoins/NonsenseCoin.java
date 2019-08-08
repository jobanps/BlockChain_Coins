package bc.nonsensecoins;

import java.util.Scanner;

import bc.blockchain.BlockChain;

public class NonsenseCoin extends BlockChain {
	
	
	public NonsenseCoin() {
		super();
	}
	
	public void mineNonsenseCoin() {
		
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		data += this.getBlockChain().get(this.getBlockChain().size() - 1).get;
		
		String hashCode = BlockChain.getValidHashCode(data);
		
		input.close();
	}
	
	

}
