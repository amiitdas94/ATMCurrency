package mincurrency;

import java.util.Scanner;

public class CurrencyProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		CalCurrency(amount);
	}
	public static void CalCurrency(int amount)
	{
		int currency[]=new int[]{2000,500,200,100,50,20,10,5,2,1};
		int currencycount[]=new int[currency.length];
		for(int i=0;i<currency.length;i++)
		{
			if(amount>=currency[i])
			{
				currencycount[i]=amount/currency[i];
				amount=amount-currencycount[i]*currency[i];
			}
		}
		for(int i=0;i<currency.length;i++)
		{
			if(currencycount[i]!=0)
			{
				System.out.println("no. of "+currency[i]+" is :"+currencycount[i]);
		
			}
		}
	}
}
