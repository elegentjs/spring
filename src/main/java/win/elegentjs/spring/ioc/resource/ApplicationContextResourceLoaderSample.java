package win.elegentjs.spring.ioc.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import win.elegentjs.spring.util.FileUtil;

import java.io.IOException;

@Slf4j
public class ApplicationContextResourceLoaderSample {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // classPath下资源
        Resource r = context.getResource("classpath:application.properties");
        print(r);

        // url资源
        r = context.getResource("https://www.baidu.com");
        print(r);

        // file url资源
        r = context.getResource("file:/Users/liupeijun/logs/nacos/config.log");
        print(r);


    }

    private static void print(Resource r) throws IOException {
        log.info("==> resource.exists(): {}", r.exists());
        log.info("==> resource.getDescription(): {}", r.getDescription());
        log.info("==> resource.isReadable(): {}", r.isReadable());

        String result = FileUtil.inputStreamToString(r.getInputStream());
        log.info("==> result: {}", result);
    }
}
