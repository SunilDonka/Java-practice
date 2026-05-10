package coreJavaTopics;
import java.util.*;

public class MergedArrays {
	public static void main(String[] args) 
		{
		    String a[]={"chai","coffee"};
		    String b[]={"milk","water","coke"};
		    String n="";
		    String m="";
		    for(int i=0;i<a.length;i++)
		    {
		        n+=a[i];
		        
		   }
		       for(int j=0;j<b.length;j++)
		       {
		            m+=b[j];
		            
		        }
		    System.out.println(n+m);
		    }
	}



