package win.elegentjs.spring.ioc.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import win.elegentjs.spring.util.FileUtil;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * 演示ClasspathResource的使用
 */
@Slf4j
public class ClasspathResourceSample {

    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("application.properties");

        log.info("==> resource.exists(): {}", resource.exists());
        log.info("==> resource.getDescription(): {}", resource.getDescription());
        log.info("==> resource.isReadable(): {}", resource.isReadable());

        String result = FileUtil.inputStreamToString(resource.getInputStream());
        log.info("==> result: {}", result);

    }
}
