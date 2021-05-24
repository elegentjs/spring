package win.elegentjs.spring.ioc.imports.selector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyImportSelector.class)
public class MyImportSelectorConfig {
}
