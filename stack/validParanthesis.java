package top_75_in_java.stack;
import java.util.Stack;
public class validParanthesis {

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
        if (ch == '(' || ch == '{' || ch == '[') {
            // Push opening brackets onto the stack.
            stack.push(ch);
        } else {
            if (stack.isEmpty()) {
                // If the stack is empty and we encounter a closing bracket, it's invalid.
                return false;
            }

            char top = stack.pop(); // Pop the top of the stack.
            if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                // If the closing bracket doesn't match the corresponding opening bracket, it's invalid.
                return false;
            }
        }
    }

    // If the stack is empty after processing all characters, it's valid.
    return stack.isEmpty();
}

    
}
