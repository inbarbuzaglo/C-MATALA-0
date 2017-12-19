package Algo;


import java.util.ArrayList;

import Headline_Obj.Position;
import Headline_Obj.line;
import matala0.line_OUTPUT_FORMAT;

public class WeightedMean {
	/**
	 *
	 * @author Meytal
	 *This class represents the calculation of the whightedMean as an Object
	 */
	
	public static Position Weighted(ArrayList <line> Algo1) 
	{
		   double sumsig;
		   double[] arr=new double[3];
		   for(int j=0;j<arr.length;j++)
		   {
			   arr[j]=1/(Math.pow((double)Algo1.get(j).getWifi().getRSSI(),2));
		   }
		   
		   sumsig=arr[0]+arr[1]+arr[2];
		   double Latsum = 0.0, Lonsum = 0.0 , Altsum=0.0;
		   for(int i=0;i<3;i++)
		   { 
			   Latsum += Algo1.get(i).getPos().getLat()*arr[i];
			   Lonsum += Algo1.get(i).getPos().getLon()*arr[i];
			   Altsum += Algo1.get(i).getPos().getAlt()*arr[i];	 
		   }
		   
		   Latsum=Latsum/sumsig;
		   Lonsum=Lonsum/sumsig;
		   Altsum=Altsum/sumsig;
		   Position pos=new Position(Latsum,Lonsum,Altsum);
		   return pos;
	}
	
	
	public static Position Weighted(ArrayList <line_OUTPUT_FORMAT> Algo1, double[] arr) 
	{
		   double sumsig;
		   sumsig=arr[0]+arr[1]+arr[2];
		   double Latsum = 0.0, Lonsum = 0.0 , Altsum=0.0;
		   for(int i=0;i<3;i++)
		   { 
			   Latsum += Algo1.get(i).getPos().getLat()*arr[i];
			   Lonsum += Algo1.get(i).getPos().getLon()*arr[i];
			   Altsum += Algo1.get(i).getPos().getAlt()*arr[i];	 
		   }
		   
		   Latsum=Latsum/sumsig;
		   Lonsum=Lonsum/sumsig;
		   Altsum=Altsum/sumsig;
		   Position pos=new Position(Latsum,Lonsum,Altsum);
		   return pos;
	}

}
