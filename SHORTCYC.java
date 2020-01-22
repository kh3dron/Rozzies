package Rozzies;

import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;

public class SHORTCYC {

    private static int tip;

    private static int tail;

    private static int weight;

    public static void main(String[] args) {
        new SHORTCYC().run();
    }
    public void run() {
        In in = new In("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt");
        int n = in .readInt(); //# graphs

        for (int i = 0; i < n; i++) {
            solve( in );
        }
    }
    //reads a weighted digraph from in and prints the solution
    public void solve(In in ) {
        EdgeWeightedDigraph g = readGraph( in );
        DijkstraSP shortest = new DijkstraSP(g, tip);
        double length = shortest.distTo(tail);
        if (length == Double.POSITIVE_INFINITY) {
            StdOut.print(-1 + " ");
        } else {
            StdOut.print((int) length + weight + " ");
        }
    }

    private EdgeWeightedDigraph readGraph(In in ) {
        int v = in .readInt();
        int e = in .readInt();
        EdgeWeightedDigraph g = new EdgeWeightedDigraph(v + 1);

        tail = in .readInt();
        tip = in .readInt();
        weight = in .readInt();

        for (int i = 0; i < e - 1; i++) {
            g.addEdge(new DirectedEdge( in .readInt(), in .readInt(), in .readInt()));
        }
        return g;
    }
}