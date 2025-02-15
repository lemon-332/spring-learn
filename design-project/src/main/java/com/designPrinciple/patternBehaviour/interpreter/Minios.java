package com.designPrinciple.patternBehaviour.interpreter;

public class Minios extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public Minios(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
