// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try {
	    InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
	    String t = br.readLine();
	    
	    for(int i=0; i<Integer.parseInt(t); i++){
	       String n = br.readLine();
	        int c = 0;
	        
	        for(int j=0; j<n.length(); j++){
	            if(n.charAt(j) == '4'){
	                c++;
	            }
	        }
	        System.out.println(c);
	    }
	    
	} catch(Exception e) {
	    return;
	}
	}
}

