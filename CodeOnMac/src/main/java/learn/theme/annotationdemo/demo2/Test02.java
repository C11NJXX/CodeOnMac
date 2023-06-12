package main.java.learn.theme.annotationdemo.demo2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws NoSuchMethodException {
        //获取方法参数的 annotation
        //获取方法实例
        Method method = Person.class.getMethod("method", int.class, String.class);
        //获取所有方法参数的 annotation
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for(Annotation[] annotations : parameterAnnotations) {
            for(Annotation annotation : annotations) {
                if(annotation instanceof Report r) {
                    r.value();
                }else {
                    //
                }
            }
        }
    }
}
