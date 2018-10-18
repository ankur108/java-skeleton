package answers;

import java.util.*;
import java.util.Collections;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
            
         ArrayList<Integer> FinalPortfolio = new ArrayList<Integer>();
            
         for(int j=0;j<portfolios.length;j++)
            {
               for(int k=j+1;k<portfolios.length;k++)
               {
                   FinalPortfolio.add(portfolios[j]^portfolios[k]);
               }
            }
            return Collections.max(FinalPortfolio);
	}

}
