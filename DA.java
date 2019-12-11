package Rozzies;

import java.io.*;

public class DA {

    public static void main (String[] args) {
        BufferedReader reader;
        int[] output = new int[1000];
        try {
            reader = new BufferedReader(new FileReader("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));
            String line     = reader.readLine();
            String[] nums   = line.trim().split("\\s+");

            line = reader.readLine();
            while (line != null) {
                nums = line.trim().split("\\s+");
                int first   = Integer.parseInt(nums[0]) - 1;
                int second  = Integer.parseInt(nums[1]) - 1;

                output[first]++;
                output[second]++;

                line = reader.readLine();
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        for (int o : output) System.out.print(o + " ");
    }
}