package com.xiangqian.test;
/*����һ�������õ�һ����Χ����������
 * @param start ��ΧΪ��ʼ��
 * @param end ��Χ��ֹ��
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
