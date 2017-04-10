package com.xiangqian.test;
/*这是一个用来得到一个数的质因数的类*/
public class PrimeFactorization {
	private int number;
	public PrimeFactorization(int number){this.number=number;}
	/*这是唯一的一个方法，用来生成表达式*
	 *@param null
	 *@return void*
	 */
	public void getExpression(){
		int number1=number;
		System.out.print(number1+"=");
		int k=2;
		while(true){
			if(k==number1){System.out.print(k);break;}
			else if(number1%k==0){
				System.out.print(k+"*");
				number1/=k;}
			else k++;
		}
	}
}
