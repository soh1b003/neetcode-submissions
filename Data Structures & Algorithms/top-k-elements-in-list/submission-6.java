class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 1; i--) {
            for (int j = 0; j < bucket[i].size(); j++) {
                res[index] = bucket[i].get(j);
                index++;
                if (index == k)
                    return res;
            }
        }

        return res;
    }
}