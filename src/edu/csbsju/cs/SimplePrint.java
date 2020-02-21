/**
 * 
 */
package edu.csbsju.cs;

/**
 * This class is used to simply print out the Name and Age inputed
 * @author mheimer001
 *
 */
public class SimplePrint {

	private String pName;
	private int pAge;

	/**
	 * this constructor makes a SimplePrint object made with a name and age
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}


	/**
	 * This main method prints out the names of the authors as well as printing out how many args there have 
	 * been entered in as an array of strings
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
	 * this returns the name entered the SimplePrint Object
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * this changes the name of the SimplePrint Object
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
