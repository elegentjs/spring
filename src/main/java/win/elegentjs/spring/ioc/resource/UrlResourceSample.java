package win.elegentjs.spring.ioc.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import win.elegentjs.spring.util.FileUtil;

import java.io.IOException;


/**
 * 演示UrlResource的使用
 */
@Slf4j
public class UrlResourceSample {

    public static void main(String[] args) throws IOException {
        Resource resource = new UrlResource("https://www.baidu.com");

        log.info("==> resource.exists(): {}", resource.exists());
        log.info("==> resource.getDescription(): {}", resource.getDescription());
        log.info("==> resource.isReadable(): {}", resource.isReadable());

        String result = FileUtil.inputStreamToString(resource.getInputStream());
        log.info("==> result: {}", result);

    }
}
