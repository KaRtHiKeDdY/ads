import java.util.PriorityQueue;

public class MinCostRope {
    
    public static int minCostToConnectRopes(int[] arr, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : arr) {
            minHeap.add(rope);
        }
        int minCost = 0;
        while (minHeap.size() > 1) {
            int rope1 = minHeap.poll();
            int rope2 = minHeap.poll();
            int mergedCost = rope1 + rope2;
            minCost += mergedCost;
            minHeap.add(mergedCost);
        }
        return minCost;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int n = 4;
        int minCost = minCostToConnectRopes(arr, n);
        System.out.println("Minimum cost to connect ropes: " + minCost);
    }
}
