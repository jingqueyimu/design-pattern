package com.test.others.interpreter.arith;

/**
 * 赋值表达式
 */
public class AssignExpression extends Expression {

    public AssignExpression(String code) {
        super(code);
    }

    @Override
    public int interpret(Context context) {
        // a = 1
        // 以"空格等号空格"分隔变量与数值
        String[] codes = code.split(" = ");
        // 变量表达式
        VarExpression var = new VarExpression(codes[0]);
        // 变量赋值
        context.assign(var, Integer.parseInt(codes[1]));
        return 0;
    }
}
