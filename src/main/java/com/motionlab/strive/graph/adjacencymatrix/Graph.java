package com.motionlab.strive.graph.adjacencymatrix;

import java.util.ArrayList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class Graph {

    public ArrayList<GraphNode> vertices = new ArrayList<GraphNode>();
    public int[][] adjacencyMatrix;

    public  Graph(ArrayList<GraphNode> vertices) {
       this.vertices = vertices;
       this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
    }

    public void addUndirectedEdge(int i, int j) {
          adjacencyMatrix[i][j] = 1;
          adjacencyMatrix[j][i] = 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        for (int i = 0; i < vertices.size(); i++) {
            sb.append(vertices.get(i).name + " ");
        }
        sb.append("\n");
        for (int i = 0; i < vertices.size(); i++) {
            sb.append(vertices.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                sb.append((j) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
