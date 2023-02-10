/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an Smoothie class that is extended from the Beverage class
 * Due: 8/7/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/
public class Smoothie extends Beverage {
	
	private int numOfFruits;
	private boolean addProtein;
	private final double FRUIT_COST = .50;
	private final double PROTEIN_COST = 1.50;
	
	public Smoothie(String n, SIZE s, int nof, boolean ap) {
		super(n, TYPE.SMOOTHIE, s);
		numOfFruits = nof;
		addProtein = ap;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtien() {
		return addProtein;
	}
	
	public double getFruitCost() {
		return FRUIT_COST;
	}
	
	public double getProteinCost() {
		return PROTEIN_COST;
	}
	
	public void setNumOfFruits(int nof) {
		numOfFruits = nof;
	}
	
	public void setProteinPowder(boolean ap) {
		addProtein = ap;
	}
	
	@Override
	public double calcPrice() {
		double price = super.getBasePrice();

		if (super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE) {
			price += 2 * super.getSizePrice();
		}

		price += numOfFruits * FRUIT_COST;
		if (addProtein) {
			price += PROTEIN_COST;
		}
		return price;
	}
	
	public String toString() {
		String s = getBevName() + ", " + getSize() + " " + numOfFruits + " Fruits";

		if (addProtein) {
			s += " Protein powder";
		}
		s += ", $" + calcPrice();
		return s;
		}
	
	public boolean equals(Smoothie s) {
		if (super.equals(s) && numOfFruits == s.getNumOfFruits() && addProtein == s.getAddProtien()) {
			return true;
		}
		else {
			return false;
			}
		}

}
