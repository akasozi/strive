package com.motionlab.strive.graph.adjacencylist;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */

import java.util.*;

public class Graph {

    public ArrayList<GraphNode> vertices = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> vertices) {
        this.vertices = vertices;
    }

    public void addUndirectedEdge(int i, int j) {
       GraphNode first = vertices.get(i);
       GraphNode second = vertices.get(j);
       first.neighbours.add(second);
       second.neighbours.add(first);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < vertices.size(); i++) {
            s.append(vertices.get(i).name + ": ");
            for (int j =0; j < vertices.get(i).neighbours.size(); j++) {
                if (j == vertices.get(i).neighbours.size()-1 ) {
                    s.append((vertices.get(i).neighbours.get(j).name) );
                } else {
                    s.append((vertices.get(i).neighbours.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
