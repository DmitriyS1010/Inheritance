package Task1;

public class ExelentPupil extends Pupil{

private double averageBall;

    public ExelentPupil(String name, String surname, int age,double averageBall) {
        super(name, surname, age);
        this.setAverageBall(averageBall);
    }

    public double getAverageBall() {
        return averageBall;
    }

    public void setAverageBall(double averageBall) {
        if (averageBall>1.0 && averageBall<=5.0 ){
        this.averageBall = averageBall;}
        else this.averageBall=-1;
    }

    public String study() {

        return super.study() + " отлично";

    }

    public String read() {


        return super.read() + " отлично";
    }

    public String write() {


        return super.write() +" хорошо";
    }

    public String relax() {

        return super.relax() + " мало";

    }

    @Override
    public String toString() {

        return
                super.toString() +
                " средний балл = " + this.averageBall + " }";
    }
}
