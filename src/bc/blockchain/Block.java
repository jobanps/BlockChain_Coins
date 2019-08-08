package bc.blockchain;


public class Block {
	
	private String data;
	private String hashCode;
	private String lastHashCode;
	private long xFactor;
	
	//Block Class Constuctor
	public Block(String data, String hashCode, String lastHashCode, long xFactor) {
		
		this.data = data;
		this.hashCode = hashCode;
		this.lastHashCode = lastHashCode;
		this.xFactor = xFactor;
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

	public long getxFactor() {
		return xFactor;
	}

	public void setxFactor(long xFactor) {
		this.xFactor = xFactor;
	}
	
	
	
	

}
