package com.example.demo.singleton;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy(){}

    //懒汉模式中单例是在需要的时候才去创建的，
    // 如果单例已经创建，再次调用获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。
   /* public static SingletonLazy getInstance(){
        if(singletonLazy ==null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }*/

    public static synchronized SingletonLazy getInstance(){
        if(singletonLazy ==null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
