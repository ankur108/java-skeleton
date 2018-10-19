package answers;

import java.util.Arrays;

public class Question5 {

	public static int shareExchange(int[] allowedAllocations, int totalValue) {
		
            int allocation=0;
            
            Arrays.sort(allowedAllocations); 
            
            for(int i=0;i<allowedAllocations.length;i++)
            {
                if(totalValue!=allowedAllocations[i] && totalValue%allowedAllocations[i]==0)
                {
                    allocation=totalValue/allowedAllocations[i];
                }
            }
            return allocation;
	}

}
