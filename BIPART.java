package Rozzies;

import edu.princeton.cs.algs4.Bipartite;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.*;

public class BIPART {

    public static void main(String[] args) {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");
        int n = in.readInt();
        for (int i = 0; i < n ; i++) {

            int numNodes = in.readInt();
            int numEdges = in.readInt();

            Graph fish = new Graph(numNodes + 1);

            for (int e = 0; e < numEdges; e++) {
                fish.addEdge(in.readInt(), in.readInt());
            }

            Bipartite fishy = new Bipartite(fish);
            int term = 1;

            if (!fishy.isBipartite()){
                term = -1;
            }
            System.out.print(term + " ");


        }

    }
}