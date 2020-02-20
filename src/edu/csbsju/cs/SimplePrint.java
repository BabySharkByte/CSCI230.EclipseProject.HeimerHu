/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author mheimer001
 *
 */
public class SimplePrint {

	private String pName;
	private int pAge;

	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Heimer and Hu!!!");
		for(int i = 0; i<args.length;i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
	
	
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}


}