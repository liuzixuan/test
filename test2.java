package zuidazhi;

import java.util.*;

public class test2 {
	public static void main(String[] args)
	{
		Scanner input=new 
	    Scanner(System.in);
		System.out.print("请输入数组中数的个数：");
		int num=input.nextInt();
		int array[]=new int[num]; 
		for(int i=0;i<num;i++)
		{
			if((int)(Math.random()*2)==0)
			{
				array[i]=(int)(Math.random()*10);
				}
			else
			{
				array[i]=-(int)(Math.random()*10);
				}
			}
		for(int i=0;i<num;i++)
		{
			System.out.println(array[i]);
			}
		int max=0;
		int list[]=new int[num];
		for(int j=0;j<num;j++)
		{
			max=array[j];
			int sum=0;
			for(int t=j;t<num;t++)
			{
				sum=sum+array[t];
				if(sum>max)
				{
					max=sum;
					}
				}
			list[j]=max;
			}
		for(int i=0;i<num;i++)
		{
			System.out.print("第"+(i+1)+"次比较的子数组的和的最大值为：");
			System.out.println(list[i]);
			}
		for(int i=1;i<num;i++)
		{
			max=list[0];
			if(list[i]>max)
			{
				max=list[i];
				}
			}
		System.out.print("子数组和的最大值为："+max);
		}
	
}
	