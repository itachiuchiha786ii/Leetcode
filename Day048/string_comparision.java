class Solution {
    public int compress(char[] chars) {
		int idx = 0;
int c = 1;

for (int i = 1; i <= chars.length; i++) {

    if (i < chars.length && chars[i] == chars[i - 1]) {
        c++;
    } else {
        chars[idx++] = chars[i - 1];
        if (c > 1) {
            for (char ch : String.valueOf(c).toCharArray()) {
                chars[idx++] = ch;
            }
        }
        c = 1;
    }
}
        return idx;
		
    }
}
