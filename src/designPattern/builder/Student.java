package designPattern.builder;

import designPattern.builder.exception.InvalidYoeException;

public class Student {
    private int id;
    private String Name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(Builder b) {
            this.id = b.id;
            this.Name = b.Name;
            this.yoe = b.yoe;
            this.gradYear = b.gradYear;
            this.psp = b.psp;
            this.batchName = b.batchName;
    }
    //this is static method which will return object of Builder type
    //Static because we need to call it before creating student object
    //once this method is called this will create object default constructor of builder
    public static Builder builder(){
        Builder b= new Builder();
        return  b;
    }

    static class Builder{
        int id;
        String Name;
        int yoe;
        int gradYear;
        double psp;
        String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            Name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        public Student build() {
            if(yoe < 1)
                throw new InvalidYoeException("Invalid Years of experience");

            Student s = new Student(this);
            return s;
        }
    }
}
