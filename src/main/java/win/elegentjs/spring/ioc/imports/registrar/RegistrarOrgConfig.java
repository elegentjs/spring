package win.elegentjs.spring.ioc.imports.registrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class RegistrarOrgConfig {

}
