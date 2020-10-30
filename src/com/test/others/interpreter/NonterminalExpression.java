package com.test.others.interpreter;

/**
 * 非终结符表达式
 */
public class NonterminalExpression implements Expression {

    private Expression exp1;
    private Expression exp2;
    
    public NonterminalExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    
    @Override
    public void interpret(Context context) {
        System.out.println("NonterminalExpression is interpreting...");
        // 调用其他表达式的解释方法
        exp1.interpret(context);
        exp2.interpret(context);
    }
}
