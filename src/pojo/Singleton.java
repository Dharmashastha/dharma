package pojo;

public enum Singleton 
{
		SINGLETON;
}


/*class Singleton {

    private static Singleton instance;
    
    private Singleton(){}
    
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

public static Singleton getInstance(){
    if(instance == null){
        synchronized (Singleton.class) {
            if(instance == null){
                instance = new Singleton();
            }
        }
    }
    return instance;
}*/