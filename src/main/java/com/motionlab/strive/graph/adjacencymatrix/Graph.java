package com.motionlab.strive.graph.adjacencymatrix;

import java.util.ArrayList;
import java.util.LinkedList;

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

    // get neighbours
    private ArrayList<GraphNode> getNeighbours(GraphNode node) {
        ArrayList<GraphNode> neighbours = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbours.add(vertices.get(i));
            }
        }
        return neighbours;
    }

    // BFS Internal
    private void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for (GraphNode neighbourNode : neighbours) {
                if (!neighbourNode.isVisited) {
                    queue.add(neighbourNode);
                    neighbourNode.isVisited = true;
                }

            }

        }
    }

    public void bfs() {
        for(GraphNode node: vertices) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
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
