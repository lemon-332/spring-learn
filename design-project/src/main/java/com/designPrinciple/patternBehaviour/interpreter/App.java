package com.designPrinciple.patternBehaviour.interpreter;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        context.assign(a, 10);
        context.assign(b, 20);
        AbstractExpression expression = new Minios(new Plus(a, b), new Minios(a, b));
        System.out.println(expression.interpret(context));
    }
}
