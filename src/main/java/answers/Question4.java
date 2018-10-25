package answers;

import java.util.ArrayList;

public class Question4 {

	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		
            ArrayList<Integer> sum = new ArrayList<Integer>(); 
            ArrayList<Integer> sumAll = new ArrayList<Integer>(); 
            
    int summ=0;
    int con=0;
    int num=0;
    int max=0;

    out:for (int x = 0; x < rows.length; x++) 
    {
    in:for (int y = 0; y < rows.length; y++) 
    {
            if(rows[x][y].equals("X"))
            {
                if(con==1)
                {
                    if(num==numberMachines)
                     {
                        sum.add(summ);
                      }
                    else
                    {
                          sum.add(0); 
                          
                    }
                    num=0;
                    con=0;
                    summ=0;
                    continue out;
                }
                    
            }
            else
            { num++;
              summ+=Integer.parseInt(rows[x][y]); 
              con=1;
            }
        
    }
    if(num==numberMachines)
    {
      sum.add(summ); 
    }
    else
    {
      sum.add(0);  
    }
    
    
    summ=0;
    con=0;
    num=0;
    
}
 for (int x = 0; x < rows.length; x++) 
    {
    for (int y = 0; y < rows.length; y++) 
    {
           try{
               if(Integer.parseInt(rows[x][y])>-1)
            {
                    summ+=Integer.parseInt(rows[x][y]);                 
            }
           }
           catch(Exception e){
               
           }
    }  
    sumAll.add(summ);
    summ=0;
}
 for (int x = 0; x < rows.length; x++) 
    {
    for (int y = 0; y < rows.length; y++) 
    {
        if(sum.get(x)==0)
        {
            continue;
        }
        else if(x==y)
        {
           max=sum.get(x)>sumAll.get(y)? sumAll.get(y):sum.get(x);
        }
        else
        {
            continue;
        }
    }  
    
}
		return max;
	}

}
