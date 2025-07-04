public class ParBal {
    public static void main(String[] args) {
        String expression = "((a+b))+(c+d))";
        if (isBalanced(expression)) {
            System.out.println("Parenthesis are balanced");
        } else {
            System.out.println("Parenthesis are not balanced !!");
        }
    }

    public static boolean isBalanced(String ex) {
        char[] stack = new char[ex.length()];
        int tos = -1;
        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);
            if (ch == '(') {
                tos++;
                stack[tos] = ch;
            } else if (ch == ')') // if closing parenthesis then pop
            {
                if (tos == -1) // No matching parenthesis
                {
                    return false;
                }
                tos--; // pop from the stack
            }
        } // end of for
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
        // or above can be written as
        // return tos==-1;
    }// end of isBalanced
}// end of ParBal
