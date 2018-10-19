package answers;

import java.util.ArrayList;

public class Question2 {

	public static int equallyBalancedCashFlow(int[] cashflowIn, int[] cashflowOut) {

            
     ArrayList<Integer> cashInSet= new ArrayList<Integer>();
     ArrayList<Integer> cashOutSet= new ArrayList<Integer>();
     int total=0;
     int difference=Integer.MAX_VALUE;
   

		for (int i = 0; i < (1<<cashflowIn.length); i++) 
		{ 
			for (int j = 0; j < cashflowIn.length; j++) 
				if ((i & (1 << j)) > 0) 
                                {
                                    total+=cashflowIn[j];
                                } 
                       cashInSet.add(total);
                       total=0;
		}
                total=0;
                for (int p = 0; p < (1<<cashflowOut.length); p++) 
		{ 
			for (int j = 0; j < cashflowOut.length; j++) 
				if ((p & (1 << j)) > 0) 
                                {
                                    total+=cashflowOut[j];
                                } 
                       cashOutSet.add(total);
                       total=0;
		}
                
            cashInSet.remove(0); 
            cashOutSet.remove(0);
               
            for(int i=0;i<cashInSet.size();i++)
            {
                for(int j=0;j<cashOutSet.size();j++)
                {
                    if(cashInSet.get(i)>=cashOutSet.get(j) && difference>(cashInSet.get(i)-cashOutSet.get(j)))
                    { 
                        difference=cashInSet.get(i)-cashOutSet.get(j);
                        
                    }
                    
                }
            }
            
            return difference;
	}

}
