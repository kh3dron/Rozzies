package Rozzies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PARSORT {

    public static void main(String[] args) {


        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));


            String line = reader.readLine();
            String[] nums = line.trim().split("\\s+");
            int numNums = Integer.parseInt(nums[0]);

            line = reader.readLine();
            String[] values = line.trim().split("\\s+");
            int[] betterValues = new int[numNums];
            for (int r = 0; r < numNums; r++){
                betterValues[r] = Integer.parseInt(values[r]);
            }

            line = reader.readLine();
            int placeValue = Integer.parseInt(line);
            Arrays.sort(betterValues);

            for (int w = 0; w < placeValue; w++){
                System.out.print(betterValues[w] + " ");
            }


            reader.close();


        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
