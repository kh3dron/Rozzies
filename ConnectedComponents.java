package Rozzies;
import edu.princeton.cs.algs4.DepthFirstDirectedPaths;
import edu.princeton.cs.algs4.DepthFirstSearch;

import java.io.*;
import java.util.*;

public class ConnectedComponents
{
    //globals - reachable from all functions
    public static boolean[] visited;

    public static void depthFirstSearch(boolean[][] edges, int currV){
        if(visited[currV]){
            return;
        }
        visited[currV] = true;
        for (int i = 1; i < edges[currV].length; i++) {
            if (edges[currV][i]){
                depthFirstSearch(edges, i);
            }
        }
        return;

    }

    public static void main (String[] args)
    {
        //read in lines
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));
            String line     = reader.readLine();
            String[] nums   = line.trim().split("\\s+");

            //Start reading
            int numNodes = Integer.parseInt(nums[0]);
            int numEdges = Integer.parseInt(nums[1]);
            boolean[][] edges = new boolean[numEdges+1][numEdges+1];
            visited = new boolean[numNodes+1];
            int comComponents = 0;

            //loop to read in new data
            line = reader.readLine();

            //populate adjacency matrix
            for (int r = 0; r < numEdges; r++){
                nums = line.trim().split("\\s+");

                int edge1 = Integer.parseInt(nums[0]);
                int edge2 = Integer.parseInt(nums[1]);
                edges[edge1][edge2] = true;
                edges[edge2][edge1] = true;
                line = reader.readLine();
            }
            reader.close();


            //count how many DFSearches are needed to find everyone
            for (int j = 1; j < numNodes; j++){
                if (!visited[j]){
                    comComponents++;
                    depthFirstSearch(edges,j);
                }
            }

            System.out.println(comComponents);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}