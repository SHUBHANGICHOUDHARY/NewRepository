package com.Discount.Java;

public class Customer
{
	String name;
	boolean member;
	String memberType;
	
	public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }
	Customer(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		System.out.println("Name is "+name);
		return name;
	}
	boolean isMember() 
	{
		System.out.println("Member = "+member );
		return member;
	}
	void setMember(boolean member)
	{	
		this.member=member;
	}
	String getMemberType() 
	{
		System.out.println("Member Type = "+memberType);
		return memberType;
	}
	void setMemberType(String memberType)
	{	
		System.out.println("Set membertype ="+memberType);
		
	}
	public String toString()
	{
		return "Name = " +name+"  ( Member = " +member +"MemberType"+memberType+" ) ";
	}
}
