package designPattern.singleton;

public class DBCon {
    private static DBCon dbObj;
    private DBCon(){
        System.out.println("Obj created");
    }

    public static DBCon getDbObj(){
        if (dbObj==null){
            dbObj=new DBCon();
        }
        return  dbObj;
    }

}
