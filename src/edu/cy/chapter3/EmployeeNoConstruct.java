package edu.cy.chapter3;

/**
 * Created by yuchen on 11/10/14.
 */
public class EmployeeNoConstruct extends java.lang.Object {
    protected String name;
    protected int age;
    
    /*
    * 如非必要，尽量避免使用finalize，它和C++里面dtor的性质完全不同。C++有RAII的概念，dtor是实现这一机制必要的一环，但是Java（非常遗憾的）没有RAII，它的对象销毁是不确定的。
    *
    * 1. finalize不应该用来管理socket, file handle, database connection等昂贵资源，因为finalize是在object被GC的时候才调用——如果内存足够，它可能永远都不会被调用
    * 2. 对于关闭JVM的时候必须要做的事情，应该用Runtime#addShutdownHook(Thread hook)来实现，放到finalize里面的code并不保证在这个时候会被调用
    * 3. 即使Override了finalize，事情也没有那么简单，首先，override了finalize的object并不是和其他情况下一样直接释放内存，也不是直接调用finalize，
    * 而是放到finalizing queue，由JVM上一个单独的thread来进行处理，同时你要当心在finalize里面不小心调用了code，把object自己重新reference到——这个时候它就复活了，
    * 可能事情做到一半，又从finalizing queue里面拿出来了，造成不稳定的状态——这种风险是不值得绝大多数情况下的应用场景的
    * 4. 对于需要管理生命周期的对象，应该用Spring的initializing/destroyable bean等来进行管理
    * 5. 对于socket, file handle, database connection, thread等昂贵资源，更应该首先考虑复用（连接池，线程池）
    *
    * 综上所述，除非有足够正当的理由，足够多的测试，足够多的经验，否则不要用finalize，既不要call，也不要override.
     */
    // To be called before GC, so may never be invoked if there is enough memory
    /*
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(name + ": Destructor");
        // super.finalize();
    }
    */
}
