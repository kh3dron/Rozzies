package Rozzies;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.*;

public class SEMICON {

    public static void main(String[] args) {
        new SEMICON().run();
    }

    private void run() {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");
        int numberOfGraphs = in .readInt();
        for (int i = 0; i < numberOfGraphs; i++) {
            Digraph g = readGraph( in );
            solveAndPrint(g);
        }
    }

    private void solveAndPrint(Digraph g) {
        Topological topo = new Topological(g);
        if (topo.hasOrder()) {
            StdOut.print(1 + " ");
        } else {
            StdOut.print(-1 + " ");
        }
    }

    private Digraph readGraph(In in ) {
        int v = in .readInt();
        int e = in .readInt();
        Digraph g = new Digraph(v);
        for (int i = 0; i < e; i++) {
            g.addEdge( in .readInt() - 1, in .readInt() - 1);
        }
        return g;
    }
}