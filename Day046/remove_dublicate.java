class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            freq[ch - 'a']--;

            if (used[ch - 'a']) {
                continue;
            }

            while (sb.length() > 0) {
                char last = sb.charAt(sb.length() - 1);

                if (last > ch && freq[last - 'a'] > 0) {
                    used[last - 'a'] = false;
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    break;
                }
            }

            sb.append(ch);
            used[ch - 'a'] = true;
        }

        return sb.toString();
    }
}
