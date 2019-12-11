package Rozzies;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class StrongConComponents {

    public static void main(String[] args) {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");

        int numNodes = in.readInt();
        int numEdges = in.readInt();

        Digraph fish = new Digraph(numNodes + 1);

        for (int i = 0; i < numEdges; i++) {
            fish.addEdge(in.readInt(), in.readInt());
        }

        //LOL it's all built in huh
        KosarajuSharirSCC graph = new KosarajuSharirSCC(fish);
        StdOut.println(graph.count() - 1);
    }


}