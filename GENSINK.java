package Rozzies;

import edu.princeton.cs.algs4.DepthFirstDirectedPaths;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.*;

public class GENSINK {

    public static void main(String[] args) {
        new GENSINK().run(); //control code
    }


    private void run() {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"); //reads in code
        int numgraphs = in .readInt();
        for (int i = 0; i < numgraphs; i++) {
            int vertex = in .readInt();
            int edge = in .readInt();
            Digraph g = new Digraph(vertex);
            boolean there = true;
            for (int j = 0; j < edge; j++) {
                g.addEdge( in .readInt() - 1, in .readInt() - 1);
            }

            for (int j = 0; j < vertex; j++) {
                there = true;
                DepthFirstDirectedPaths p = new DepthFirstDirectedPaths(g, j);
                for (int k = 0; k < vertex; k++) {
                    if (!p.hasPathTo(k)) {
                        there = false;
                        break;
                    }
                }
                if (there) {
                    StdOut.print(j + 1 + " ");
                    break;
                }
            }
            if (!there) {
                StdOut.print("-1 ");

            }

        }

    }
}