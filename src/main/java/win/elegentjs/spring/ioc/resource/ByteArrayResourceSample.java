package win.elegentjs.spring.ioc.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import win.elegentjs.spring.util.FileUtil;

import java.io.IOException;


/**
 * 演示ByteArrayResource的使用
 *
 * 读取ByteArrayResource资源并打印出来
 *
 */
@Slf4j
public class ByteArrayResourceSample {

    public static void main(String[] args) throws IOException {
        Resource resource = new ByteArrayResource("hello world".getBytes());

        log.info("==> resource.exists(): {}", resource.exists());
        log.info("==> resource.getDescription(): {}", resource.getDescription());
        log.info("==> resource.isReadable(): {}", resource.isReadable());

        String result = FileUtil.inputStreamToString(resource.getInputStream());
        log.info("==> result: {}", result);

    }
}
