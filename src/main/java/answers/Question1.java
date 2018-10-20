package answers;

import java.util.*;
import java.util.Collections;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
            
         ArrayList<Integer> FinalPortfolio = new ArrayList<Integer>();
            
         int temp=0,j=1;
         while(j<portfolios.length)
            {
               FinalPortfolio.add(portfolios[temp]^portfolios[j]);
               if(j==portfolios.length-1)
               {
                   temp++;
                   j=temp;
                   
               }
                j++;
            } 
         
            return Collections.max(FinalPortfolio);
    }
}
