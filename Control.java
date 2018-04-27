package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Control {

	public float Cost(String T2,String T1) {		
		float cost=0;
		try {
			cost = Cost(Duration(T2,T1));			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cost;
	}
	
	public long Duration(String T2,String T1) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		Date Start = dateFormat.parse(T1);
		Date End = dateFormat.parse(T2);
	
		long D = End.getTime()-Start.getTime();
	    return D/1000;
	    	    
	}
	
	public float Cost(long Duration) {
		float total;
		if(Duration>60) {
			total = ((Duration-60)/60.0f)+3;
		}
		else if(Duration==60)
		{
			total = 3;
		}
		else
		{
			total = Duration*3/60.0f;			
		}
		return total;
	}
	
}
