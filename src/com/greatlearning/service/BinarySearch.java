package com.greatlearning.service;
import java.util.ArrayList;


public class BinarySearch {
	public static ArrayList<Integer> longestPath(Node root)
	{
	     
	    
	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	     
	    
	    ArrayList<Integer> right = longestPath(root.right);
	     
	    
	    ArrayList<Integer> left = longestPath(root.left);
	     
	    
	    if(right.size() < left.size())
	    {
	        left.add(root.data);
	    }
	    else
	    {
	        right.add(root.data);
	    }
	     
	    
	    return (left.size() >
	            right.size() ? left :right);
	}
	
}
