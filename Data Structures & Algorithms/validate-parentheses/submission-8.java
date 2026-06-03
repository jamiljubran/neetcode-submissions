class Solution {
    public boolean isValid(String s) 
    {
      Stack<Character> shtack = new Stack<>();

      for (char c : s.toCharArray())
      {
        if ( c == '(' || c == '[' || c == '{')
        {
          shtack.push(c);
        }
        else
        {

        if (shtack.isEmpty())
        {
          return false;
        }

        char top = shtack.pop();

        if (c == ')' && top != '(')
        {
          return false;
        }

        if (c == ']' && top != '[')
        {
          return false;
        }

        if (c == '}' && top != '{')
        {
          return false;
        }
        }
      }

      return shtack.isEmpty();


    }
}
