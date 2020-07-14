/*
 * In this example, we design an algorithm that calculates the monthly paycheck of a
salesperson at a local department store.
Every salesperson has a base salary. The salesperson also receives a bonus at the end of each
month, based on the following criteria: If the salesperson has been with the store for five
years or less, the bonus is $10 for each year that he or she has worked there. If the salesperson
has been with the store for more than five years, the bonus is $20 for each year that he or she
has worked there. The salesperson can earn an additional bonus as follows: If the total sales
made by the salesperson for the month are more than $5,000 but less than $10,000, he or she
receives a 3% commission on the sale. If the total sales made by the salesperson for the month
are at least $10,000, he or she receives a 6% commission on the sale.
 * 
 * */



package salaryComputation;

public class salaryComp {
	
	public static void main (String args[]) {
		
		int salary = 4000,yearsWorked =5,salesMade=7000 ,commission = 0 ,bonus,finalPay;
		
		if((yearsWorked <= 5)) {
			
			bonus = 10;
			
		}
		else {
			bonus = 20;
		}
		
		if((salesMade>5000)&&(salesMade<10000)) {
			commission= (int)(0.3*salary); 
		}
		else if(salesMade>10000) {
			commission = (int)(0.6*salary);
			
		}
		
		
		finalPay = salary + bonus + commission ;
		System.out.println( finalPay);
	}

}
