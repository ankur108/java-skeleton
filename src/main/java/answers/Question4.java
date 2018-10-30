package answers;

import java.util.ArrayList;

public class Question4 {

	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		
      int count=0;
      int sum=0;
      int temp=0;
      int max=Integer.MAX_VALUE;
      boolean X=true;
        
      
      for(int i=0;i<rows.length;i++)
      {
          for(int j=0;j<rows.length;j++)
          {
              if(!(rows[i][j].equals("X")) && X && count<=numberMachines-1)
              {
                  temp+=Integer.parseInt(rows[i][j]);
                  count++;
                  if(count==numberMachines)
                  {
                      sum=temp;
                  }
              }
              else
              {
                  if(count>0)
                  {X=false;
                  count=0;}
              }
          }
          
          X=true;
          max=max>sum?sum:max;
          temp=0;
      }
      
      return max;
      
	}

}
