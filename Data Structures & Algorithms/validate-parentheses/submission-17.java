class Solution {
    public boolean isValid(String s) {
        Stack<Character> shtack = new Stack<>();
        for (char c : s.toCharArray()) {

        if ( c == '(' || c == '{' || c == '[') {
            shtack.push(c);
        }
        else
        {
        

            if (shtack.empty())
            {
              return false;
            }
            char top = shtack.pop();
            if (top == '(' && c != ')') {
                return false;
            }
            if (top == '{' && c != '}') {
                return false;
            }

            if (top == '[' && c != ']') {
                return false;
            }
        }
        
    }
    return shtack.empty();
}

}
