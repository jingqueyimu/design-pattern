package com.test.others.interpreter.arith;

/**
 * 代码表达式
 */
public class CodeExpression extends Expression {

    public CodeExpression(String code) {
        super(code);
    }

    @Override
    public int interpret(Context context) {
        // 代码格式: 算术表达式; 变量赋值1; 变量赋值2
        // 代码例子: a + b; a = 1; b = 2
        String[] codes = code.split("; ");
        // 算术表达式
        ArithExpression arith = new ArithExpression(codes[0]);
        // 赋值表达式
        AssignExpression assign = null;
        for (int i = 1; i < codes.length; i++) {
            assign = new AssignExpression(codes[i]);
            assign.interpret(context);
        }
        return arith.interpret(context);
    }
}
