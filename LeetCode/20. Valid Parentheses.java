//Thinking
//First see if the string length of s is even or odd. If it is odd we know it is impossible for it to be a valid parenthese so we return false. If it is even we parse through the string and if the given char is '(', '{', or '[' we add it to a stack. If the char is ')', '}', or ']' we check to see if the stack is empty or if the top item in the stack isnt the corresponding parenthese. In both of these cases we return false. We continue this process until we reach the end of the string. If the stack is empty that means all of the chars in the string s are valid parentheses thus we return true otherwise we return false.
class Solution {
    public boolean isValid(String s) {
        Stack open = new Stack();

        //Odd Length
        if(s.length() % 2 == 1) return false;

        //Even Length
        for(char c : s.toCharArray()){
           switch(c){
                //open
                case '(':
                case '{':
                case '[':
                    open.push(c);
                    break;

                //closed
                case ')':
                    if(open.isEmpty() || !open.peek().equals('(')) return false; 
                    open.pop();
                    break;
                    
                case '}':
                    if(open.isEmpty() || !open.peek().equals('{')) return false;
                    open.pop();
                    break;
                    
                case ']':
                    if(open.isEmpty() || !open.peek().equals('[')) return false;
                    open.pop();
                    break;  
           }
        } 
        return open.isEmpty();
    }
}