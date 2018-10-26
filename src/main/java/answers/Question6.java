package answers;


public class Question6 {
    
    public static int minDistance(int dist[], Boolean sptSet[],int numServers) 
	{ 
		int min = Integer.MAX_VALUE, min_index=-1; 

		for (int v = 0; v < numServers; v++) 
			if (sptSet[v] == false && dist[v] <= min) 
			{ 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	}
      public static int printSolution(int dist[], int n) 
	{ 
	    return dist[0]; 
	}
   
	public static int shortestServerRoute(int numServers, int targetServer, int[][] times) {
		
        Question6 t = new Question6(); 
	int dist[] = new int[numServers]; 
	Boolean sptSet[] = new Boolean[numServers]; 

        if(targetServer>numServers)
        {
            return 0;
        }
        else
        {
            for (int i = 0; i < numServers; i++) 
            { 
		dist[i] = Integer.MAX_VALUE; 
		sptSet[i] = false; 
	    } 

	dist[targetServer] = 0; 

        for (int count = 0; count < numServers-1; count++) 
            { 
                int u = minDistance(dist, sptSet,numServers);
		sptSet[u] = true; 
		for (int v = 0; v < numServers; v++) 
        		if (!sptSet[v] && times[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+times[u][v] < dist[v]) 
					dist[v] = dist[u] + times[u][v]; 
		} 

            return printSolution(dist, numServers);      
        }
        
	}

}
