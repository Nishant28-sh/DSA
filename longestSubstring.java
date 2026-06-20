class Solution {
    static int groupAnagrams(String[] strs) {

        java.util.HashMap<String, Integer> map =
            new java.util.HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            char[] arr = str.toCharArray();
            java.util.Arrays.sort(arr);

            String key = new String(arr);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return map.size();
    }
}