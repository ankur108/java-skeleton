package answers;

import java.util.*;
import java.util.Collections;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
            
        int temp=0;
        int max=0;
            
         for(int j=0;j<portfolios.length;j++)
            {
               for(int k=j+1;k<portfolios.length;k++)
               {
                   temp=portfolios[j]^portfolios[k];
               }
              max=temp>max?temp:max; 
            }

         return max;
         
    }
}
