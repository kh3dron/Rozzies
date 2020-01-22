package Rozzies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SQUARE {
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        Scanner readin = new Scanner(new File("/Users/tristansaldanha/IdeaProjects/Algos/src/Rozzies/rosalind_data.txt"));

        int graphs = readin.nextInt();
        boolean[] answers = new boolean[graphs];
        for (int i = 0; i < graphs; i++) {
            int vert = readin.nextInt();
            int edge = readin.nextInt();

            boolean[][] matrix = new boolean[vert][vert]; //Our Adjacency Matrix
            for (int j = 0; j < edge; j++) {
                int v1 = readin.nextInt() - 1;
                int v2 = readin.nextInt() - 1; //Read in the edge vertices (Sub 1 for easier index management)

                matrix[v1][v2] = true; //Sets the space at v1,v2 and v2,v1 true to show edge
                matrix[v2][v1] = true;
            }
            if (isSquareInGraph(matrix)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
    }
    public static boolean isSquareInGraph(boolean[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i] && DFS(matrix, visited, 0, i, -1)) {
                return true;
            }
        }
        return false;
    }
    private static boolean DFS(boolean[][] matrix, boolean[] visited, int n, int vert, int start) {

        visited[vert] = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[vert][i]) {
                if (!visited[i]) {
                    if (DFS(matrix, visited, n + 1, i, vert)) {
                        return true;
                    }
                } else if (i != start && n == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}