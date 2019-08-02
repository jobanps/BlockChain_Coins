package bc.blockchain;

public class Main {
	
	public static void main(String[] args) {
		
		BlockChain blockChain = new BlockChain();
		
		Block block1 = new Block("This is test Data", null);
		blockChain.addBlock(block1);
		Block block2 = new Block("", block1.getHashCode());
		blockChain.addBlock(block2);
		Block block3 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block3);
		Block block4 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block4);
		Block block5 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block5);
		Block block6 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block6);
		Block block7 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block7);
		Block block8 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block8);
		Block block9 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block9);
		Block block10 = new Block("", blockChain.getBlockChain().get(blockChain.getBlockChain().size()-1).getHashCode());
		blockChain.addBlock(block10);
		int i=1;
		for (Block blk : blockChain.getBlockChain()) {
			System.out.println("Hash " + i + " : " + blk.getHashCode());
			System.out.println("LastHash" + i + " : " + blk.getLastHashCode());
			i++;
		}
		
		int j=1;
		for (Block blk : blockChain.getBlockChain()) {
			System.out.println("Block " + j + " - [ " + blk.getHashCode() + " ]");
			System.out.println("                ||");
			System.out.println("                \\/");
			j++;
		}
		
		
		System.out.println(" Validate BlockChain : " + blockChain.validateBlockChain());
		
	}


}
