package designPattern.singleton;

public class Client {
    public static void main(String[] args){
        DBCon db1= DBCon.getDbObj();
        DBCon db2= DBCon.getDbObj();
        DBCon db3= DBCon.getDbObj();

    }
}
