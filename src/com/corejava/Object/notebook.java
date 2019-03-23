package com.corejava.Object;

public class notebook 
{
  int nop;
  String type;
  int cost;
  public static void main(String[] args) 
  {
	notebook n=new notebook();
	n.nop=100;
	n.type="unruled";
	n.cost=25;
	n.test();
}
  void test()
  {
	  System.out.println(nop);
	  System.out.println(type);
	  System.out.println(cost);
  }
}
