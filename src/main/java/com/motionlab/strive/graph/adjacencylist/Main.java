package com.motionlab.strive.graph.adjacencylist;

import java.util.ArrayList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class Main {

    public static void main(String[] args) {
    //        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    //        nodeList.add(new GraphNode("A",0));
    //        nodeList.add(new GraphNode("B",1));
    //        nodeList.add(new GraphNode("C",2));
    //        nodeList.add(new GraphNode("D",3));
    //        nodeList.add(new GraphNode("E",4));
    //
    //        // Add the edges
    //        Graph myGraph = new Graph(nodeList);
    //        myGraph.addUndirectedEdge(0, 1);
    //        myGraph.addUndirectedEdge(0, 2);
    //        myGraph.addUndirectedEdge(0, 3);
    //        myGraph.addUndirectedEdge(1, 4);
    //        myGraph.addUndirectedEdge(2, 3);
    //        myGraph.addUndirectedEdge(3, 4);
    //
    //        // Print the graph
    //        System.out.println(myGraph.toString());
    //        // BFS Traversal
    //        // myGraph.bfs();
    //        // DFS Traversal
    //        myGraph.dfs();


        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));
        nodeList.add(new GraphNode("F",5));
        nodeList.add(new GraphNode("G",6));
        nodeList.add(new GraphNode("H",7));
        Graph myGraph = new Graph(nodeList);

        // Add the directed edges

        myGraph.addDirectedEdge(0, 2);
        myGraph.addDirectedEdge(1, 2);
        myGraph.addDirectedEdge(1, 3);
        myGraph.addDirectedEdge(2, 4);
        myGraph.addDirectedEdge(4, 7);
        myGraph.addDirectedEdge(4, 5);
        myGraph.addDirectedEdge(5, 6);
        myGraph.addDirectedEdge(3, 5);
        // myGraph.addDirectedEdge(4, 5);

        // Print the graph
        System.out.println(myGraph.toString());
        // BFS Traversal
        // myGraph.bfs();
        // DFS Traversal
        myGraph.dfs();
    }
}
