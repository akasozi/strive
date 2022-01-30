package com.motionlab.strive.graph.adjacencylist;

import java.util.ArrayList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));

        // Add the edges
        Graph myGraph = new Graph(nodeList);
        myGraph.addUndirectedEdge(0, 1);
        myGraph.addUndirectedEdge(0, 2);
        myGraph.addUndirectedEdge(0, 3);
        myGraph.addUndirectedEdge(1, 4);
        myGraph.addUndirectedEdge(2, 3);
        myGraph.addUndirectedEdge(3, 4);

        // Print the graph
        System.out.println(myGraph.toString());

        myGraph.bfs();
    }
}
