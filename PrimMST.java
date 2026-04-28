// create adj matrix : generate MST(set of edge V')
import java.util.*;
public class PrimMST {
    public  static void main(String[] args) {
        int V = 5;
        int[][] graph = {
            {0, 2, 0, 6},
            {2, 0, 3, 8},
            {0, 3, 0, 0},
            {6, 8, 0, 0},
            
        };
        primMST(graph);
    }
    public  static void PrimMST(int[][] graph){
        int V = graph.length;
        int[] row = new int[V];
        int[] col = new int[V];
        for(int i=0; i<V; i++){
            row[i] = Integer.MAX_VALUE;
            col[i] = -1;
        }
        row[0] = 0;
        for(int count=0; count<V-1; count++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int i=0; i<V; i++){
                if(row[i] < min){
                    min = row[i];
                    minIndex = i;
                }
            }
            for(int j=0; j<V; j++){
                if(graph[minIndex][j] != 0 && graph[minIndex][j] < row[j]){
                    row[j] = graph[minIndex][j];
                    col[j] = minIndex;
                }
            }
        }
    }
    
}
