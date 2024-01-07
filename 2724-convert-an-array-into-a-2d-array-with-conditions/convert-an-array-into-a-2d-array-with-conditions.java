import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> um = new HashMap<>();
        for (int i : nums) {
            um.put(i, um.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        while (!um.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : um.entrySet()) {
                int f = entry.getKey();
                int s = entry.getValue();
                temp.add(f);
                s--;
                if (s == 0) {
                    toErase.add(f);
                }
                um.put(f, s);
            }
            ans.add(temp);
            for (int i : toErase) {
                um.remove(i);
            }
        }
        return ans;
    }
}