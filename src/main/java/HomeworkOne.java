
/*
 * This class will eventually contain the user interface
 */
public class HomeworkOne {

	static double empyArr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For working on HW#2
		double cashies[] = {4000, 5500, 15000, 18000, 24000, 9000, 11000, 12000};
		double numbies[] = {.055, .075, .045, .09, .10, .065, .035, .025};
		double futureVal_VarInt = SavingsFormulas.futureValueLS_VariableInterest(5000, numbies);
		double futureVal_VarInt2 = SavingsFormulas.futureValueLS_VariableInterest(93294, numbies);
		System.out.println("futureVal_VariableInterest1: " + futureVal_VarInt);
		System.out.println("futureVal_VariableInterest2: " + futureVal_VarInt2);

		double compSavCons_Val1 = SavingsFormulas.compoundSavingsConstant(500, 0.03, 12);
		double compSavCons_Val2 = SavingsFormulas.compoundSavingsConstant(3300, 0.12, 8);
		System.out.println("compSavCons_Val1: " + compSavCons_Val1);
		System.out.println("compSavCons_Val2: " + compSavCons_Val2);

		double compSavsVar_val1 = SavingsFormulas.compoundSavingsVariable(cashies, 0.05);
		System.out.println("compSavsVar_Val1: " + compSavsVar_val1);
		double compSavsVar_val2 = SavingsFormulas.compoundSavingsVariable(cashies, 0.17);
		System.out.println("compSavsVar_Val2: " + compSavsVar_val2);

		String arrState = "Full!";
		if (empyArr == null)
			arrState = "empy!!!";
		System.out.println("empyArr[] size is: " + arrState);

		System.out.println("lumpSum_CR1: " + SavingsFormulas.futureValueLumpSum(600, 0.08, 50));
		System.out.println("lumpSum_CR2: " + SavingsFormulas.futureValueLumpSum(130000, 0.02, 3));
		System.out.println("lumpSum_VR1: " + SavingsFormulas.futureValueLS_VariableInterest(16000, numbies));
		System.out.println("lumpSum_VR2: " + SavingsFormulas.futureValueLS_VariableInterest(97, numbies));
		System.out.println("compSav_SC1: " + SavingsFormulas.compoundSavingsConstant(5600, 0.07, 10));
		System.out.println("compSav_SC2: " + SavingsFormulas.compoundSavingsConstant(580000, 0.01, 5));
		System.out.println("compSav_VR1: " + SavingsFormulas.compoundSavingsVariable(cashies, 0.08));
		System.out.println("compSav_VR2: " + SavingsFormulas.compoundSavingsVariable(cashies, 0.33));
	}
}
