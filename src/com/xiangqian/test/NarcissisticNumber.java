package com.xiangqian.test;

public class NarcissisticNumber {
	private int start;
	private int end;
	private static final NarcissisticNumber nn1=new NarcissisticNumber(20,1000);
	private NarcissisticNumber(int start,int end){
		this.start=start;
		this.end=end;
	}
	public static NarcissisticNumber getNN(){
		return nn1;
	}
	public int getNarcissisticNumber(){
		int temp1,numbers=0;
		int temp2=0;
		int temp3=0;
		boolean equal;
		for(int i=start;i<=end;i++){
			temp1=i/100;
			temp2=i%100/10;
			temp3=i%10;
			equal=temp1*temp1*temp1+temp2*temp2*temp2+temp3*temp3*temp3==i;
			if(equal){numbers++;System.out.print(i+" ");}
		}
		return numbers;
	}

}
