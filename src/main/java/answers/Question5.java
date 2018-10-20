package answers;

import java.util.Arrays;

public class Question5 {

	public static int shareExchange(int[] allowedAllocations, int totalValue) {
		
            int allocationA=0;
            int allocationB=1;
            int tempValue=totalValue;
            
            Arrays.sort(allowedAllocations); 
            
            for(int i=0;i<allowedAllocations.length;i++)
            {
                if(totalValue%allowedAllocations[i]==0)
                {
                    allocationA=totalValue/allowedAllocations[i];
                }
            }
            for(int i=allowedAllocations.length-1;i>=0;i--)
            {
                 if(i==allowedAllocations.length-1)
                 {
                     tempValue-=allowedAllocations[i];
                 }
                 
                if(tempValue>=allowedAllocations[i])
                {
                  tempValue-=allowedAllocations[i];
                  allocationB++;
                  i--;
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
