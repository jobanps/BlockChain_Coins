package bc.nonsensecoins;

import java.security.MessageDigest;
import java.util.Scanner;

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
		for (Block blk : this.getBlockChain()) {
			System.out.println("Block " + id + " - [ " + blk.getHashCode() + " ]");
			if (id != size) {
				System.out.println("                ||");
				System.out.println("                \\/");
			}
			id++;
		}
	}

	public void mineNonsenseCoin(String data) {

		String prevHashCode = this.getBlockChain().get(this.getBlockChain().size() - 1).getHashCode();
		int xFactor = 0;
		String feedData = data + prevHashCode + xFactor; // data + previous HashCode + X;
		String hashCode = "";

		while (true) {

			hashCode = this.generateHashCode(feedData + xFactor);

			if (hashCode.startsWith("001") && hashCode.endsWith("100")) {
				System.out.println("Mining Hash Code for NonsenseCoin : " + hashCode);
				System.out.println("\n “YOU GET A NONSENSE COIN!! CONGRATS” !! (Hashcode : " + hashCode + ")\n");
				this.addNewNonsenseCoin(new Block(data, hashCode, prevHashCode, xFactor));
				break;

			} else {
				System.out.println("Mining Hash Code for NonsenseCoin : " + hashCode);
			}

			xFactor++;

		}

	}

	public void addNewNonsenseCoin(Block newBlock) {
		this.addBlock(newBlock);
	}

}
