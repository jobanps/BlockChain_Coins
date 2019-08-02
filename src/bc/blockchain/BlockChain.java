package bc.blockchain;

import java.util.ArrayList;

public class BlockChain {

	ArrayList<Block> blockChain;
	//Block Chain Class Constructor
	public BlockChain() {
		
		this.blockChain = new ArrayList<Block>();
	}
	//adding block in Block Chain
	public void addBlock(Block block) {
		this.blockChain.add(block);
	}
	
	//Getters and Setters
	public ArrayList<Block> getBlockChain() {
		return blockChain;
	}


	public void setBlockChain(ArrayList<Block> blockChain) {
		this.blockChain = blockChain;
	}

	public boolean validateBlockChain() {
		
		for (int i = 1; i < this.blockChain.size(); i++) {
			
			if(!(this.blockChain.get(i).getLastHashCode().equals(this.blockChain.get(i-1).getHashCode()))) {
				return false;
			}
			
		}
		
		
		return true;
	}

}
