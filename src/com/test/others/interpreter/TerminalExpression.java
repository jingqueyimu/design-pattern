package com.test.others.interpreter;

/**
 * 终结符表达式
 */
public class TerminalExpression implements Expression {
    
    private String data;
    
    public TerminalExpression(String data) {
        this.data = data;
    }
    
    @Override
    public void interpret(Context context) {
        System.out.println("TerminalExpression is interpreting data: " + data);
        // TODO 进行解释操作，终结符表达式不会调用其他表达式的解释方法
    }
}
