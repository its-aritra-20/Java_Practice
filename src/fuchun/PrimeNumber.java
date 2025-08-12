package fuchun;

public class PrimeNumber {
	int number;
//	PrimeNumber(int number){
//		this.number=number;
//	}
	public void calculate(int number) {
		if(number<=1) {
			System.out.println("Not Prime");
			return ;
		}
		for(int i=2;i*i<=number;i++) {
			if(number%i==0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime Number");
	}
}
