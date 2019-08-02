package bc.blockchain;

import java.util.Arrays;

public class Block {
	
	private String data;
	private String hashCode;
	private String lastHashCode;
	
	//Block Class Constuctor
	public Block(String data,  String lastHashCode) {
		super();
		this.data = data;
		this.hashCode = String.valueOf(new String[] {this.data,this.lastHashCode}.hashCode());
		this.lastHashCode = lastHashCode;
	}

	//Getters and Setters
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHashCode() {
		return hashCode;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

	public String getLastHashCode() {
		return lastHashCode;
	}

	public void setLastHashCode(String lastHashCode) {
		this.lastHashCode = lastHashCode;
	}
	
	
	
	

}
