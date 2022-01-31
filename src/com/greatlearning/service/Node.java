package com.greatlearning.service;


public class Node {
	public Node left;
	 public   Node right;
	  public  int data;

	 	
	 public static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}

}
