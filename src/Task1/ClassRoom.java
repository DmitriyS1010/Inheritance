package Task1;

import java.util.Arrays;

public class ClassRoom {


    Pupil[] classroom;
    int currentPupilsNumber;

    public ClassRoom() {
        classroom = new Pupil[0];
    }

    public ClassRoom(int pupilsNumber) {
        classroom = new Pupil[pupilsNumber];

        for (int i = 0; i < classroom.length; i++) {
            classroom[i] = new Pupil("","",0);
        }

        currentPupilsNumber = 0;
    }

    public void addPupil(Pupil pupil) { // OverLoad
        Pupil[] temp = Arrays.copyOf(classroom, classroom.length + 1);
        temp[classroom.length] = pupil;
        this.classroom = temp;
    }



    @Override
    public String toString() {
        String result = System.lineSeparator();

        for (Pupil pupil : classroom)
            result += pupil.toString() + System.lineSeparator();

        return result;

    }
}