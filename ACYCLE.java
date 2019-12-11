package Rozzies;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class ACYCLE {

    public static void main(String[] args) {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");
        int reps = in.readInt();
        for (int i = 0; i < reps ; i++) {

            int v = in.readInt();
            int e = in.readInt();
            Digraph fish = new Digraph(v+1);
            for (int d = 0; d < e ; d++) {
                fish.addEdge(in.readInt(), in.readInt());
            }

            //LOL built in bitch
            DirectedCycle c = new DirectedCycle(fish);
            int yeet = 1;
            if (c.hasCycle()){
                yeet = -1;
            }
            StdOut.print(yeet + " ");

        }
    }
}