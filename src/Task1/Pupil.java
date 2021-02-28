package Task1;

public class Pupil {

    private String name;
    private String surname;
    private int age;


    public Pupil(String name, String surname, int age) {
        this.setAge(age);
        this.setName(name);
        this.setSurname(surname);

    }

    @Override
    public String toString() {
        return "Ученик {" +
                "имя = '" + name + '\'' +
                ", фамилия = '" + surname + '\'' +
                ", возраст = " + age +" "+'\'' +
                this.study() +" "+'\'' +this.read() +" "+'\'' +this.write() + " "+'\'' +this.relax() +'\''+

                '}';
    }

    public String study() {

        return "Учится";

    }

    public String read() {


        return "Читает";
    }

    public String write() {


        return "Пишет";
    }

    public String relax() {

        return "Отдыхает";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18 && age > 5) {
            this.age = age;
        } else this.age = -1;
    }
}
