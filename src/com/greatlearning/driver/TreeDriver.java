package com.greatlearning.driver;

import java.util.ArrayList;

import com.greatlearning.service.BinarySearch;
import com.greatlearning.service.Node;

public class TreeDriver {
	public static void main(String[] args)
	{
	    Node root =Node.newNode(100);
	    root.left = Node.newNode(20);
	    root.right = Node.newNode(130);
	    root.right.right = Node.newNode (140);
	    root.right.left = Node.newNode (110);
	    root.left.right = Node.newNode(50);
	    root.left.left = Node.newNode(10);
	    root.left.left.left = Node.newNode(5);

	     
	    ArrayList<Integer> output = BinarySearch.longestPath(root);
	    int n = output.size();
	     
	    System.out.print(output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}

}
