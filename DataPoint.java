import java.io.Serializable;
import java.util.*;
public class DataPoint implements Serializable
{
        // vector of datapoints    	
	Vector<Double> v;
        //count of data points
	int count;

	public  DataPoint()
        {  
          v = new Vector<Double>();
          count = 0;
        }  

	public DataPoint( Vector<Double> v, int count)
       {
         this.v = v;
         this.count =count; 
       }

}


