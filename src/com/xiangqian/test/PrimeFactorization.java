package com.xiangqian.test;
/*����һ�������õ�һ����������������*/
public class PrimeFactorization {
	private int number;
	public PrimeFactorization(int number){this.number=number;}
	/*����Ψһ��һ���������������ɱ��ʽ*
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
