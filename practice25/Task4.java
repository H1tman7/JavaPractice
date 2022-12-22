package practice25;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task4 {
    private static boolean isCorrectExpression(String input){
        Map <Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack <Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (map.containsValue(c))
                stack.push(c);
            else if (map.containsKey(c))
                if (stack.isEmpty() || stack.pop() != map.get(c))
                    return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isCorrectExpression("(((a*b)-c)*(-a)/b)"));
        System.out.println(isCorrectExpression("{A+{B}*2"));
        System.out.println(isCorrectExpression("(({a}[(b)]c))"));
        System.out.println(isCorrectExpression("(a(d]"));
    }
}
