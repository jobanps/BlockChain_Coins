package bc.blockchain;

import java.security.MessageDigest;
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
	
	public static String[] getValidHashCode(String input) {
		
		String[] output = new String[2];
		int secretX = 0;
		 try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");           
	            byte[] hash = digest.digest((input + secretX).getBytes("UTF-8"));           
	            StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
	            for (int i2 = 0; i2 < hash.length; i2++) {
	                String hex = Integer.toHexString(0xff & hash[i2]);
	                if(hex.length() == 1) hexString.append('0');
	                hexString.append(hex);
	            }
	            output[0]= hexString.toString();
	            output[1] = String.valueOf(secretX);
	            return output;
	        }
	        catch(Exception e) {
	            throw new RuntimeException(e);
	        }
		
		 
		
	}

}
