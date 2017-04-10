package com.xiangqian.test;
/*这是一个用来得到一定范围内质数的类
 * @param start 范围为起始数
 * @param end 范围截止数
 */
public class PrimeNumber {
	private int start;
	private int end;
	public PrimeNumber(int start, int end){
		this.start=start;
		this.end=end;
	}
	public int count(){
		int numbers=0;
		for(int i=start;i<=end;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){numbers+=1;System.out.print(i+" ");break;}
			}
		}
		return numbers;
	}

}
