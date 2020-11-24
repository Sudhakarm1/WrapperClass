package org.jsp.wrapper_1;
public class WrapperDemo_1 
{
	public static void main(String[] args) 
	{
		Integer x=10;
		Integer y=10;
		System.out.println(x.hashCode());//based on content
		System.out.println(y.hashCode());//based on content
		System.out.println(x.equals(y));//based on content
		System.out.println(x==y);//based on object
		System.out.println(x);//tostring
		System.out.println(y);//tostring
		System.out.println(x.toString() == y.toString());////based on tostring address
		int z=x;
		int a=y;
		System.out.println(z);
		System.out.println(a);
		Double d1=12.23;
		Double d2=31.43;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d1==d2);
		Integer b=a;
		System.out.println(b.toString());
	}
}
