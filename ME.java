package Rozzies;


import java.io.*;
import java.util.*;

public class ME
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

                //create a new frequency tracking matrix
                int[][] frequencies = new int[lenRows][2];
                for(int a = 0; a < lenRows; a++){
                    frequencies[a][0] = frequencies[a][1] = 0;
                }

                //populate frequency matrix
                for (int g = 0; g < lenRows; g++){
                    int cur = Integer.parseInt(nums[g]);

                    for (int r = 0; r < lenRows; r++){
                        if (frequencies[r][0] == cur || frequencies[r][0] == 0){
                            frequencies[r][0] = cur;
                            frequencies[r][1] += 1;
                            break;
                        }
                    }
                }


                //search for MAJ
                int max = lenRows/2;
                int found = 0;

                for (int f = 0; f < lenRows; f++){
                    if (frequencies[f][1] > max){
                        System.out.print(frequencies[f][0] + " ");
                        found = 1;
                        break;
                    }
                }
                if (found == 0){System.out.print(-1 + " ");};

                line = reader.readLine();
            }
            reader.close();



        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}