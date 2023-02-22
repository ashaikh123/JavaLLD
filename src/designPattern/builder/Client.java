package designPattern.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder()
                .setId(1)
                .setName("abdullah")
                .setGradYear(2021)
                .setYoe(1)
                .setPsp(80)
                .build();
    }
}
