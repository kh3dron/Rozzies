package Rozzies;
import edu.princeton.cs.algs4.DepthFirstDirectedPaths;
import edu.princeton.cs.algs4.DepthFirstSearch;

import java.io.*;
import java.util.*;


public class THREESUM {

    public static void main(String[] args) {
        //read in lines
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));
            String line = reader.readLine();
            String[] nums = line.trim().split("\\s+");

            //Start reading
            int numSets = Integer.parseInt(nums[0]);
            int lenSets = Integer.parseInt(nums[1]);

            //loop to read in new data
            line = reader.readLine();

            for (int r = 0; r < numSets; r++) {
               System.out.println("Running for R=" + r);

                nums = line.trim().split("\\s+");
                String[] sortedNums = nums.clone();


                for (int f = 0; f < lenSets; f++) {
                    System.out.print(nums[f] + " ");
                }

                System.out.println();

                int l, m;
                boolean done = false;
                Arrays.sort(sortedNums);

                for (int f = 0; f < lenSets; f++) {
                    System.out.print(nums[f] + " ");
                }

                System.out.println();

                //System.out.println("Sorted");

                for (int i = 0; i < lenSets - 2; i++) {

                    // To find the other two elements, start two index variables
                    // from two corners of the array and move them toward each
                    // other
                    l = i + 1; // index of the first element in the remaining elements
                    m = lenSets - 1; // index of the last element

                    while (l < m) {
                        int num1 = Integer.parseInt(sortedNums[i]);
                        int num2 = Integer.parseInt(sortedNums[l]);
                        int num3 = Integer.parseInt(sortedNums[m]);
                        System.out.println(((i) + " " + (l) + " " + (m) + " - Values: " + num1 + " " + num2 + " " + num3));

                        if (num1 + num2 + num3 == 0) {
                            System.out.println("Done!\n");
                            done = true;
                            break;
                        } else if (num1 + num2 + num3 < 0) {
                            l++;
                            //System.out.println("L too small");
                        } else { // A[i] + A[l] + A[r] > sum
                            //System.out.println("R too large");
                            m--;
                        }

                    }
                    if (done) {
                        break;
                    }
                }

                if (!done) {
                    System.out.println("Nothing found, -1\n");
                }

                line = reader.readLine();

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();


        }

    }
}