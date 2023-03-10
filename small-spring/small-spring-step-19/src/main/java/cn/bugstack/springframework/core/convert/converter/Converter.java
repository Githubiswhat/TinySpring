package cn.bugstack.springframework.core.convert.converter;

/**
 * A converter converts a source object of type {@code S} to a target of type {@code T}.
 * <p>
 * 类型转换处理接口
 * <p>
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 * <p>
 * 来自于对开源项目的学习；
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface Converter<S, T> {

    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     */
    T convert(S source);

}
