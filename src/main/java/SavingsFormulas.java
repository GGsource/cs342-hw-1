public class SavingsFormulas {

    //Method #1 - futureValueLumpSum
    public static double futureValueLumpSum(double cash, double interest, int years) {
        return cash * Math.pow(1+interest, years);
    }

    //Method #2 - futureValueLS_VariableInterest
    public static double futureValueLS_VariableInterest(double cash, double values[]) {
        return recursiveVarInterest(values, 0, cash);
    }
    //Helper Recursive function for futureValueLS_VariableInterest. Tail recursive.
    private static double recursiveVarInterest(double values[], int ndx, double accumulation){
        if (ndx > values.length - 1)
            return accumulation;
        return recursiveVarInterest(values, ndx+1, accumulation * (1+values[ndx]));
    }

    //Method #3 - compoundSavingsConstant
    public static double compoundSavingsConstant(double cash, double interest, int years) {
        return cash * (((Math.pow(1+interest, years))-1)/interest);
    }

    //Method #4 - compoundSavingsVariable
    public static double compoundSavingsVariable(double values[], double interest) {
        return recursiveCompSavVar(values, interest, 0, values[0]);
    }
    //Helper Recusrive function for compoundSavingsVariable
    private static double recursiveCompSavVar(double values[], double interest,int ndx, double accumulation) {
        if(ndx >= values.length-1)
            return accumulation;
        return recursiveCompSavVar(values, interest, ndx+1, (accumulation * (1+interest)) + values[ndx+1]);
    }
}
