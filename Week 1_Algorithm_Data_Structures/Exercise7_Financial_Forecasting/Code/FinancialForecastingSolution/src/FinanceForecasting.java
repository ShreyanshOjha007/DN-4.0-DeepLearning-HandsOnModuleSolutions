/* Assumption:
 * We have past values and future growth rates. Starting from the last known value
 * we apply each growth rate step by step to predict future values.
 * So, if the last value is v and future growth rates are [g0, g1, ..., gn-1], we calculate:
 * v1 = v * g0
 * v2 = v1 * g1 ...
 * vn = v * g0 * g1 * ... * gn-1
 * Basically, we multiply the value by each growth rate in order to forecast ahead.
 */
public class FinanceForecasting {

    public static double predictValue(double currValue , double [] growthRate){
        return helper(currValue,growthRate,0);
    }

    public static double helper(double currValue, double [] growthRate,int index){
        // base case : all growth rate processed
        if(index >= growthRate.length) return currValue;

        //  recursively calling by helper with updated currValue multiplied with the growthRate
        return helper(currValue*growthRate[index] ,growthRate,index+1);
    }
    public static void main(String[] args) {
        double initialValue = 100.0;
        double[] growthRates = {1.05, 1.02, 1.03};  // 5%, 2%, 3% growth, length of the array indicates the
        // how month a head the value needs to be predicted in this case its predicting the value for 3 months ahead

        System.out.println("Predicted value :" + predictValue(initialValue, growthRates));
    }
}