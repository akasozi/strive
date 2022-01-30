package com.motionlab.strive.graph.adjacencylist;

import java.util.ArrayList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited = false;

    public ArrayList<GraphNode> neighbours = new ArrayList<>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
