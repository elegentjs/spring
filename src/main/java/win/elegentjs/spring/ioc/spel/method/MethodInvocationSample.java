package win.elegentjs.spring.ioc.spel.method;

import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Method;

/**
 * 演示自定义方法调用示例，向ctx注册了方法parseInt和parseInt2
 * 看看执行效果
 */
@Slf4j
public class MethodInvocationSample {

    public static void main(String[] args) throws NoSuchMethodException {
        //创建ctx容器
        StandardEvaluationContext ctx = new StandardEvaluationContext();

        //获取java自带的Integer类的parseInt(String)方法
        Method parseInt = Integer.class.getDeclaredMethod("parseInt", String.class);

        //将parseInt方法注册在ctx容器内
        ctx.registerFunction("parseInt", parseInt);

        //再将parseInt方法设为parseInt2
        ctx.setVariable("parseInt2", parseInt);

        //创建ExpressionParser解析表达式
        ExpressionParser parser = new SpelExpressionParser();

        //SpEL语法，比对两个方法执行完成后，结果是否相同
        String expreString = "#parseInt('2') == #parseInt2('3')";
        Expression expression = parser.parseExpression(expreString);
        Boolean result = expression.getValue(ctx, Boolean.class);
        log.info("==> expreString: {}, result: {}", expreString, result);

        expreString = "#parseInt('2') == #parseInt2('2')";
        expression = parser.parseExpression(expreString);
        result = expression.getValue(ctx, Boolean.class);
        log.info("==> expreString: {}, result: {}", expreString, result);
    }
}
