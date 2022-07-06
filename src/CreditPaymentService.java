public class CreditPaymentService {
    public int calculate(int sumCredit, int creditTerm) {
        double annualRate = 9.99;
        double monthlyRate = annualRate / 12 / 100;

        double annuityRatio = (monthlyRate * Math.pow((1 + monthlyRate), creditTerm * 12)) /
                ((Math.pow((1 + monthlyRate), creditTerm * 12) - 1));
        int monthlyPayment = (int) (sumCredit * annuityRatio);

        return monthlyPayment;
    }
}
