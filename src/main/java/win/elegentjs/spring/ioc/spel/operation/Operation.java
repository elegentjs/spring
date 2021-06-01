package win.elegentjs.spring.ioc.spel.operation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * 演示SpEL使用操作符
 * 包括：
 *
 * 算术运算符
 * 字符串拼接
 * 比较运算符
 * 逻辑运算符
 * 条件运算符
 * 正则表达式

 */
@Data
public class Operation {

    // 算术运算符：加法
    @Value("#{10 + 1}")
    private Integer num1;

    // 算术运算符：减法
    @Value("#{10 - 1}")
    private Integer num2;

    // 算术运算符：乘法
    @Value("#{10 * 1}")
    private Integer num3;

    // 算术运算符：除法
    @Value("#{10 / 1}")
    private Integer num4;

    // 算术运算符：取余
    @Value("#{10 % 1}")
    private Integer num5;

    // 算术运算符：指数
    @Value("#{10 ^ 3}")
    private Integer num6;

    // 字符串拼接
    @Value("#{21 + '年' + 6 + '月'}")
    private String str1;

    // 比较运算符 <
    @Value("#{1 < 10}")
    private Boolean oper1;

    // 比较运算符 lt
    @Value("#{1 lt 10}")
    private Boolean oper2;

    // 比较运算符 >
    @Value("#{1 > 10}")
    private Boolean oper3;

    // 比较运算符 gt
    @Value("#{1 gt 10}")
    private Boolean oper4;

    // 比较运算符 ==
    @Value("#{1 == 10}")
    private Boolean oper5;

    // 比较运算符 eq
    @Value("#{1 eq 10}")
    private Boolean oper6;

    // 比较运算符 <=
    @Value("#{1 <= 10}")
    private Boolean oper7;

    // 比较运算符 le
    @Value("#{1 le 10}")
    private Boolean oper8;

    // 比较运算符 >=
    @Value("#{10 >= 1}")
    private Boolean oper9;

    // 比较运算符 ge
    @Value("#{10 ge 1}")
    private Boolean oper10;

    // 逻辑运算符 and
    @Value("#{true and false}")
    private Boolean logic1;

    // 逻辑运算符 &&
    @Value("#{true && false}")
    private Boolean logic2;

    // 逻辑运算符 or
    @Value("#{true or false}")
    private Boolean logic3;

    // 逻辑运算符 ||
    @Value("#{true || false}")
    private Boolean logic4;

    // 逻辑运算符 not
    @Value("#{not false}")
    private Boolean logic5;

    // 逻辑运算符 !
    @Value("#{!false}")
    private Boolean logic6;

    // 三元运算
    @Value("#{(10 > 3) ? 'YES': 'FALSE'}")
    private String condition1;

    @Value("#{'19898990988' matches '\\d+'}")
    private Boolean regExp;

}
