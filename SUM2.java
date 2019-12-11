package Rozzies;


import java.io.*;
import java.util.*;

public class SUM2
{
    public static void main (String[] args)
    {
        //globals


        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));
            String line     = reader.readLine();
            String[] nums   = line.trim().split("\\s+");

            //Start reading

            int numRows = Integer.parseInt(nums[0]);
            int lenRows = Integer.parseInt(nums[1]);

            line = reader.readLine();
            while (line != null) {
                nums = line.trim().split("\\s+");

                //create a new data tracking matrix
                int[] frequencies = new int[lenRows];
                for(int a = 0; a < lenRows; a++){
                    frequencies[a] = 999999;
                }

                int discoveredMatch = -1;
                int matchPoint = -1;

                //populate frequency matrix while checking for neg matches
                for (int g = 0; g < lenRows; g++){
                    int cur = Integer.parseInt(nums[g]);

                    while(discoveredMatch == -1){
                        for (int r = 0; r < lenRows; r++){
                            if (frequencies[r] == -cur){
                                //System.out.println("Found a neg of " + cur);
                                discoveredMatch = r;
                                matchPoint = g;
                                break;
                            }
                            if (frequencies[r] == 999999){
                                //System.out.println("No match found for " + cur);
                                frequencies[r] = cur;
                                break;
                            }
                        }
                        break;
                    }

                }

                if (discoveredMatch > -1){
                    System.out.println(discoveredMatch+1 + " " + (matchPoint+1));
                } else {
                    System.out.println(-1);
                }

                line = reader.readLine();
            }
            reader.close();



        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}