package win.elegentjs.spring.ioc.spel.literal;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * 演示SpEL字面量使用
 */
@Data
public class Literal {

    // 整数
    @Value("#{5}")
    private Integer arg1;

    // 浮点数
    @Value("#{3.14}")
    private Double arg2;

    // 科学计数法
    @Value("#{1e4}")
    private Long arg3;

    // 字符串
    @Value("#{'我是字符串'}")
    private String arg4;

    // 布尔值
    @Value("#{true}")
    private Boolean arg5;
}
