class Solution {
    public boolean isValid(String s) {
        Stack<Character> map = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                map.push(c);
            } else {
                if (map.isEmpty()) {
                    return false;
                }
                char top = map.pop();

                if (top == '(' && c != ')' || top == '[' && c != ']' || top == '{' && c != '}') {
                    return false;
                }
            }
        }
        return map.isEmpty();
        
    }
}
