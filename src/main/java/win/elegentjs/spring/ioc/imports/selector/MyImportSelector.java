package win.elegentjs.spring.ioc.imports.selector;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import win.elegentjs.spring.ioc.imports.javabeans.Org;

/**
 * 自定义的ImportSelector，实现导入Org Bean,
 * bean name: win.elegentjs.spring.ioc.imports.javabeans.Org
 */
public class MyImportSelector implements ImportSelector, BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                Org.class.getName()
        };
    }
}
