package designPattern.Prototype;

public class Client {
    public static void main(String[] args){
        StudentRegistry SR= new StudentRegistry();

        Student aprBatch=new Student();
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setBatchName("Apr22");
        aprBatch.setYearOfEnrollment(2022);
        SR.save(aprBatch);

        Student janBatch=new Student();
        janBatch.setAvgBatchPsp(70);
        janBatch.setBatchName("Jan22");
        janBatch.setYearOfEnrollment(2023);
        SR.save(janBatch);

        Student mayBatch=new Student();
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setBatchName("May22");
        mayBatch.setYearOfEnrollment(2021);
        SR.save(mayBatch);


        Student aprS1=SR.get("Apr22").clone();
        Student janS2=SR.get("Jan22").clone();
        Student mayS3=SR.get("May22").clone();

        IntelligentStudent aprBatchI=new IntelligentStudent();
        aprBatchI.setAvgBatchPsp(95);
        aprBatchI.setBatchName("Apr22");
        aprBatchI.setYearOfEnrollment(2022);
        aprBatchI.setIq(44);

        IntelligentStudent intaprS1=aprBatchI.clone();
    }
}
