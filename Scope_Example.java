/*
 * Write a program that uses the famous E = mc^2 formula
 * to calculate mass and energy equivalence in both directions
 */
public class Scope_Example {
	static final double C = 299792458;  // Defining  constant
	
	public static void main(String[] args) {
		
		System.out.print("The energy given is: " + Calc_energy(80) + "\n");  // 
		System.out.println("The mass given is: " + Calc_mass(90));
	}
	
	public static double Calc_energy(double m) {
		double energyMass =  m * Math.pow(C, 2);
		return energyMass;
	}
	
	public static double Calc_mass(double m) {
		double massEnergy = m / Math.pow(C, 2);
		return massEnergy ;
	}
}
