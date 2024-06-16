class Solution {
    public int findKthLargest(int[] nums, int k) {
 PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min heap

        for (int num : nums) {
            pq.offer(num);

            // If size of heap exceeds k, remove the smallest element
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // The kth largest element will be at the top of the heap
        return pq.peek();
    }
        
    }
