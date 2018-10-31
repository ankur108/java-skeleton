package answers;

import java.util.Arrays;

public class Question5 {

	public static int shareExchange(int[] allowedAllocations, int totalValue) {
		
            if(allowedAllocations.length<1)
            {
                return 0; 
            }
            else
            {
            int allocationA=0;
            int allocationB=1;
            int tempValue=totalValue;
            
            Arrays.sort(allowedAllocations); 
            
            for(int i=allowedAllocations.length-1;i>=0;i--)
            {
                if(totalValue%allowedAllocations[i]==0)
                {
                    allocationA=totalValue/allowedAllocations[i];
                    break;
                }
                
            }
            
            tempValue=allowedAllocations[allowedAllocations.length-1];

            for(int i=allowedAllocations.length-1;i>=0;i--)
            {
                if(tempValue>allowedAllocations[i])
                {
                  tempValue-=allowedAllocations[i];
                  allocationB++;
                }
                
            }
            
            if(allocationB==1)
            {
                return allocationA; 
            }
            else
            {
                return allocationA>allocationB?allocationB:allocationA; 
            }  
            }
        }

}
