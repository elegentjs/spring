package win.elegentjs.spring.ioc.beanpost;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Data
@Slf4j
public class Car {

    // 车身颜色
    private String color;

    // 车子型号
    private String version;

    @PostConstruct
    public void init() {
        log.info("==> in Car init method.");
    }

}
