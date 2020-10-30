package com.test.others.interpreter.arith;

/**
 * 运算符表达式
 */
public class OperatorExpression extends Expression {

    Expression var1;
    Expression var2;
    
    public OperatorExpression(Expression var1, String code, Expression var2) {
        super(code);
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public int interpret(Context context) {
        OperatorExpression operator = null;
        switch (code) {
        case "+":
            operator = new AddExpression(var1, var2);
            break;
        case "-":
            operator = new SubExpression(var1, var2);
            break;
        default:
            throw new RuntimeException("暂不支持该运算");
        }
        return operator.interpret(context);
    }
}
