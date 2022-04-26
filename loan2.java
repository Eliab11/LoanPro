import java.util.Date;
public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	public Loan() {
		this(2.5, 1 , 100);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;	
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
//loanAmount must be calculated

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	//return loan Amount

	public double  getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow( 1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
    }
	
	public Date getLoanDate() {
		return loanDate;
	}
}
