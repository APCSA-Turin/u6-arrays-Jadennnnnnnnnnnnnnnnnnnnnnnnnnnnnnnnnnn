public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
        
    public Payroll(int[] items) {
        itemsSold = items;
        wages = new double[items.length];
    }
       
    public double[] getWages() {
        return wages;
    }
        
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
            
        for(int items : itemsSold) {
            sum += items;
            if (items < min) {
                min = items;
            } else if (items > max) {
                max = items;
            }
        }
        return (double) (sum - min - max) / (itemsSold.length - 2);        
    }
       
    /* Computes employee wages as described in part (b) and stores
        them in wages. The parameter fixedWage represents the fixed
        amount each employee is paid per day. The parameter
        perItemWage represents the amount each employee is paid per
        item sold.
    */
    public void computeWages(double fixedWage, double perItemWage) {
        for(int i = 0; i < wages.length; i++) {
            double wage = fixedWage + itemsSold[i] * perItemWage;
            if (wage >= computeBonusThreshold()) {
                wage *= 1.1;
            }
            wages[i] = wage;
        }
    }     
}