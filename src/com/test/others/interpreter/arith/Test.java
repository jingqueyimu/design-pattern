package com.test.others.interpreter.arith;

public class Test {

    public static void main(String[] args) {
        // 上下文环境
        Context context = new Context();
        // 运行代码
        int result = context.run("a + b; a = 1; b = 2");
        System.out.println("结果1：" + result);
        result = context.run("a - b; a = 7; b = 2");
        System.out.println("结果2：" + result);
    }
}
