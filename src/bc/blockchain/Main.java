package bc.blockchain;

import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		BlockChain blockChain = new BlockChain();
		


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
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Input : ");
		String input = sc.nextLine();
		String hashCode = "";
		int x=0;
		while(true) {
			
			hashCode = calcHash(input + x);
			x++;
			if(hashCode.startsWith("001") && hashCode.endsWith("100")) {
				System.out.println("Hash FOOOOOOOOOOUUUUUUUNNNNNNNNNNDDDDDD : " + hashCode);
				System.out.println("Enter Input : ");
				input = sc.nextLine();
			} else {
				System.out.println("Mining Hash Code : " + hashCode);
			}
			
		}
		
	}
	
	public static String calcHash(String input) {
		
		
		 try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");           
	            byte[] hash = digest.digest(input.getBytes("UTF-8"));           
	            StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
	            for (int i2 = 0; i2 < hash.length; i2++) {
	                String hex = Integer.toHexString(0xff & hash[i2]);
	                if(hex.length() == 1) hexString.append('0');
	                hexString.append(hex);
	            }
	            return hexString.toString();
	        }
	        catch(Exception e) {
	            throw new RuntimeException(e);
	        }
		
		
	}


}
