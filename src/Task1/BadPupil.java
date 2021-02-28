package Task1;

public class BadPupil extends Pupil{


    private double averageBall;

    public BadPupil(String name, String surname, int age,double averageBall) {
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


    @Override
    public String toString() {

        return
                super.toString() +
                        " средний балл = " + this.averageBall + " }";
    }

    public String study() {

        return super.study() + " плохо";

    }

    public String read() {


        return super.read() + " нормально";
    }

    public String write() {


        return super.write() +" плохо";
    }

    public String relax() {

        return super.relax() + " много";

    }

}
