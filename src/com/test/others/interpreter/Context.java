package com.test.others.interpreter;

/**
 * 上下文环境（运行环境）
 * 用于管理全局信息
 */
public class Context {
    
    // TODO 处理全局信息的相关方法
    
    /**
     * 运行
     */
    public void run(String data) {
        // 调用相关表达式的解释方法
        Expression terminal1 = new TerminalExpression(data);
        Expression terminal2 = new TerminalExpression(data);
        Expression nonterminal = new NonterminalExpression(terminal1, terminal2);
        nonterminal.interpret(this);
    }
}
