package com.motionlab.strive.one;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SetMatrixZeroes {

    public int[][] setMatrixZero(int[][] matrix) {

        Queue<Point> queue = new LinkedList<Point>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                 if (matrix[i][j] == 0) {
                     queue.add(new Point(i, j));
                 }
            }
        }

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == point.i && j == point.j) {
                        int k = 0, l = 0;
                        while (k <= matrix[i].length-1) {
                            matrix[i][k] = 0;
                            k++;
                        }
                        while (l <= matrix.length-1) {
                            matrix[l][j] = 0;
                            l++;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    private static class Point {

        private int i;
        private int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public Point() {

        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }
}
