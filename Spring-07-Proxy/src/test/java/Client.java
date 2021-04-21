import com.hong.Service.ProxyInvocationHandler1;
import com.hong.Service.UserService;
import com.hong.Service.UserServiceProxy;
import com.hong.Service.UserService_impl;
import org.junit.Test;

/**
 * @description:
 *
 * 我们在不改变原来的代码的情况下，
 * 实现了对原有功能的增强，这是AOP中最核心的思想
 *
 * 自己对代理模式的理解
 * 代理模式：
 * 在需要对原代码的功能增强
 * 增加一个代理类 实现新增加的功能 不需要增改原代码
 *
 * 动态代理的代理类是动态生成的 . 静态代理的代理类提前写好
 *
 * 现在用的比较多的是 javasist 来生成动态代理
 * javassist使用全解析
 * Java 字节码以二进制的形式存储在 .class 文件中，每一个 .class 文件包含一个 Java 类或接口。
 * Javaassist 就是一个用来 处理 Java 字节码的类库。它可以在一个已经编译好的类中添加新的方法，
 * 或者是修改已有的方法，并且不需要对字节码方面有深入的了解。同时也可以去生成一个新的类对象，
 * 通过完全手动的方式。
 * @author: hjx
 * @time: 2021年04月08日 8:58
 */
public class Client {

    @Test
    public void static_proxy() {

        //真实业务处理
        UserService_impl user = new UserService_impl();


        //代理业务处理
        UserServiceProxy proxy = new UserServiceProxy() ;
        proxy.setUser(user);

        proxy.add();
        proxy.update();
        proxy.query();
        proxy.delete();
    }

    @Test
    public void dynamic_proxy(){
        UserService_impl user = new UserService_impl();
        ProxyInvocationHandler1 proxy = new ProxyInvocationHandler1();
        proxy.setUser(user);

        UserService proxy1 = (UserService) proxy.getProxy();

        proxy1.add();
        proxy1.update();
        proxy1.delete();
        proxy1.query();

    }



}
