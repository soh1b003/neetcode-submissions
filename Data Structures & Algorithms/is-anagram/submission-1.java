class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] s_char_array = s.toCharArray();
        char[] t_char_array = t.toCharArray();

        Arrays.sort(s_char_array);
        Arrays.sort(t_char_array);
        return Arrays.equals(s_char_array, t_char_array);
    }
}