package win.elegentjs.spring.ioc.lifecycle.initdestroy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Group {

    private String name;

    public void init() {
        log.info("==> in group init method.");
    }

    public void close() {
        log.info("==> in group close method.");
    }

}
