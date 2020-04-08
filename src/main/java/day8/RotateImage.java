
/*
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
import java.util.*;
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int swap(int tmp, int[][] matrix, Point p){
        int v = tmp;
        tmp = matrix[p.x][p.y];
        matrix[p.x][p.y] = v;
        return tmp;
    }
    
    public static void rotate(int[][] matrix) {
        int i = 0;
        int j = 0;
        int n = matrix.length;
        int n1 = n;
        while(true){
             if(n1 <= 1){
                return ;
            }
            Point p1 = new Point(i,j);
            Point p2 = new Point(i, n - 1 - j);
            Point p3 = new Point(n - i - 1, n - j - 1);
            Point p4 = new Point(n - i - 1, j);
            for(int k = 0; k < n1 - 1; k ++){
                int tmp = matrix[p1.x][p1.y];
                tmp = swap(tmp, matrix, p2);
                tmp = swap(tmp, matrix, p3);
                tmp = swap(tmp, matrix, p4);
                tmp = swap(tmp, matrix, p1);
                p1.y ++;
                p2.x ++;
                p3.y --;
                p4.x --; 
            } 
            i += 1;
            j += 1;
            n1 -= 2;
        }
        
    }

    public static void main(String[] args){
	    System.out.println("Enter the size of matrix");
	    Scanner ip = new Scanner(System.in);
	    int len = ip.nextInt();
	    int[][] matrix = new int[len][len];
	    for(int i = 0; i < len; i ++){
		    for(int j = 0; j < len; j ++){
			    System.out.println("Enter val");
			    matrix[i][j] = ip.nextInt();
		    }
	    }
	    rotate(matrix);
	    for(int i = 0; i < len; i ++){
		    for(int j = 0; j < len; j ++){
			    System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println("");
	    }
    }
}
