package Rozzies;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.In;

import edu.princeton.cs.algs4.KosarajuSharirSCC;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;


public class INV {

    public static void main(String[] args) {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");

        int length = in.readInt();
        int[] data = new int[length];

        for (int i = 0; i < length; i++) {
            data[i] = in.readInt();
        }

        long inverts = 0;
        for (int i = 0; i < length - 1; i++)
            for (int j = i + 1; j < length; j++)
                if (data[i] > data[j])
                    inverts += 1;

        System.out.println(inverts);

    }



}
