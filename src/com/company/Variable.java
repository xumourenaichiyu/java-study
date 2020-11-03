package com.company;

public class Variable {
    public static void main(String[] args) {
        //java变量： 基本类型变量 、 引用类型变量
        /*
         * 1、基本类型
         * （1）整数类型
         *   byte(字节)、short、int、long
         *  （2）浮点类型
         *    float（单精度浮点型）、double(双精度浮点型)
         *  （3）字符类型
         *    char
         *   (4)布尔类型
         *    boolean
         *
         * 字节占用
         * byte: 1字节
         * short: 2字节
         * int: 4字节
         * long: 8字节
         * float: 4字节
         * double: 8字节
         * char: 2字节
         * boolean: java对Boolean的存储没有规定，理论上Boolean只需1bit,但JVM内部把Boolean类型表示为4个字节的整数
         * */

        //整数类型
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        //浮点类型
        float f1 = 3.14f;//3.14
        float f2 = 3.14e10f;//3.14*10^10
        double d1 = 1.5e20;//1.5* 10^20
        System.out.println("f1=" + f1);
        System.out.println("f2=" + f2);
        System.out.println("d1=" + d1);

        //布尔类型
        boolean bool = true;
        boolean b1 = 5 < 3;
        System.out.println("bool=" + bool);
        System.out.println("b1=" + b1);

        //字符类型
        char ch = 'a';
        System.out.println("ch=" + ch);

        //引用类型
        //String
        String str = "hello word";
        String newStr = str;
        System.out.println("str=" + str);
        System.out.println("newStr=" + newStr);
        str = "hello java";
        System.out.println("str=" + str);
        System.out.println("newStr=" + newStr);// ?

        //常量
        final double PI = 3.14;
        //PI = 3.2; //PI为常量，不可变

        //var关键字
        StringBuilder sb = new StringBuilder();
        var sb1 = new StringBuilder();//类型推论可以自动得到sb1类型为StringBuilder
    }
}