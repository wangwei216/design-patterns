package four_project;



public class Singleton {

    //这里因为我在new单例的对象的时候，其实是分三步进行的：
        //1. 需要先申请分配内存空间
        //2. 为这个对象进行初始化
        //3. 把这singleton的实例的内存地址指向他
    private volatile static Singleton singleton;

    public Singleton(){
    }

    public static Singleton getSingleton() {
        if (singleton == null){
              synchronized (Singleton.class){
                if (singleton == null){
                     singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }
}
