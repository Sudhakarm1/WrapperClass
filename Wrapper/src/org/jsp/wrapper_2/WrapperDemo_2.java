package org.jsp.wrapper_2;
public class WrapperDemo_2 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		if(x==y)
		{
		System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		if(((Integer)x).equals((Integer)y))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		if(((Integer)x).compareTo(((Integer)y)) == 0)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		Integer x1=10;//scp
		Integer y1=10;//scp
		if(x1==y1)
		{
		System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		if(((Integer)x1).equals((Integer)y1))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		if(((Integer)x1).compareTo(((Integer)y1)) == 0)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
}
