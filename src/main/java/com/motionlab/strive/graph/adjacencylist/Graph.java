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


    // Internal
    private void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbour: currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode node: vertices) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    // DFS internal
    private void dfsVisit(GraphNode node) {
       Stack<GraphNode> stack =  new Stack<GraphNode>();
       stack.push(node);

       while (!stack.isEmpty()) {
           GraphNode currentNode = stack.pop();
           currentNode.isVisited = true;
           System.out.print(currentNode.name + " ");
           for(GraphNode neighbourNode: currentNode.neighbours) {
               if (!neighbourNode.isVisited) {
                   stack.push(neighbourNode);
                   neighbourNode.isVisited = true;
               }
           }
       }
    }

    public void dfs() {
        for (GraphNode node: vertices) {
            if (!node.isVisited)
               dfsVisit(node);
        }
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
