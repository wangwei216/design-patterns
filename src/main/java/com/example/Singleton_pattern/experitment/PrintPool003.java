package com.example.Singleton_pattern.experitment;

    /*
    * 使用懒汉式（双重加锁来实现）
    *
    * */
public class PrintPool003 {

    private static volatile PrintPool003 instance;

    private PrintPool003(){}

    public static PrintPool003 getInstance(){
        //如果调用到获取实例的时候就就使用锁
        if (instance==null){
            synchronized (PrintPool003.class){
                //这里在返回对象的时候，也使用到了volatile进行保证在new对象的是保证了原子性
                instance = new PrintPool003();
            }
        }

        return instance;
    }

    public void StartWorking(PrintPool003 instance){

        System.out.println("打印池池开始工作-------->");
        if (instance!=null){
            System.out.println("说明打印池已经存在----->");
        }else{
            System.out.println("说明打印池为空！！！");
        }

    }

    public void DeletePool(PrintPool003 instance){
        if (instance!=null){
            System.out.println("删除打印池————————>"+instance.getClass());
        }

    }

    public static void  main(String[] args){

        PrintPool003 instance = PrintPool003.getInstance();
        instance.StartWorking(instance);
        instance.DeletePool(instance);

    }

}
