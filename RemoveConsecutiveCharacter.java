// Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
class RemoveConsecutiveCharacter{
    public static String removeConsecutiveCharacter(String s) {
    StringBuilder sb = new StringBuilder();
    char prev = s.charAt(0);
    sb.append(prev);
    for (int i = 1; i < s.length(); i++) {
        char curr = s.charAt(i);
        if (curr != prev) {
            sb.append(curr);
            prev = curr;
        }
    }
    return sb.toString();
    }
    public static void main(String[] args){
        String s= "aabb";
        removeConsecutiveCharacter(s);
    }
}