package cn.bugstack.springframework;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
