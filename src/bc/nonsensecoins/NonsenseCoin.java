package bc.nonsensecoins;

import bc.blockchain.Block;
import bc.blockchain.BlockChain;

public class NonsenseCoin extends BlockChain {

	public NonsenseCoin(String data) {
		super();
		this.addBlock(new Block(data, generateHashCode(data)));
	}

	public void viewChain() {

		int size = this.getBlockChain().size();
		int id = 1;
		System.out.println("\nBlock Chain");
		for (Block blk : this.getBlockChain()) {
			System.out.println("Block " + id + " - [ " + blk.getHashCode() + " ]");
			if (id != size) {
				System.out.println("                  |");
				System.out.println("                 \\ /");
			}
			id++;
		}
	}

	public Block mineNonsenseCoin(String data, String username) {

		String prevHashCode = this.getBlockChain().get(this.getBlockChain().size() - 1).getHashCode();
		int xFactor = 0;
		String feedData = data + prevHashCode + xFactor; // data + previous HashCode + X;
		String hashCode = "";

		while (true) {

			hashCode = this.generateHashCode(feedData + xFactor);
			System.out.println("Mining Hash Code for NonsenseCoin : " + hashCode);
			
			if (isValidCoin(hashCode)) {
				Block newCoin = new Block(data, hashCode, prevHashCode, xFactor);
				this.addNewNonsenseCoin(newCoin, username);
				return newCoin;

			}
			xFactor++;

		}

	}

	//valid new coin hash to qualify as nonsenseCoin
	public boolean isValidCoin(String hashCode) {
		if (hashCode.startsWith("001") && hashCode.endsWith("100")) {
			return true;
		}
		return false;
	}

	//function to add new Coin
	public void addNewNonsenseCoin(Block newBlock, String name) {
		System.out.println("\n “YOU GET A NONSENSE COIN!! CONGRATS " + name + "” !! (Hashcode : " + newBlock.getHashCode() + ")\n");
		this.addBlock(newBlock);
	}

}
