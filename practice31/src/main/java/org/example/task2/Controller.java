package org.example.task2;

public class Controller {

    public static Model model = new Model();
    public static View view;
    public static String getSolveExpression(String expression) throws Exception {
        return Double.toString(model.solveExpression(expression));
    }

    public static void main(String[] args) {
        view = new View();
    }
}
