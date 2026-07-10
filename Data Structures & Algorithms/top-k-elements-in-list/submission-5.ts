class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums: number[], k: number): number[] {
        const map = new Map();
        const res = [];

        for (let i = 0; i < nums.length; i++) {
            if (map.has(nums[i])) {
                const count = map.get(nums[i]);
                map.set(nums[i], count + 1);
            } else {
                map.set(nums[i], 1);
            }
        }

        const entries = [...map.entries()];
       
        entries.sort((a, b) => b[1] - a[1]);

        for (let i = 0; i < k; i++) {
            res.push(entries[i][0]);
        }

        return res;
    }
}