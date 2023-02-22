package designPattern.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(IntelligentStudent i) {
        super(i);
        this.iq = i.iq;
    }

    public IntelligentStudent() {
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
