import Task1.*;
import Task3.DocumentWorker;
import Task3.ExpertDocumentWorker;
import Task3.ProDocumentWorker;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

       // Task1();
         Task3();
    }

    private static void Task1() {


        Pupil pupil = new Pupil("Иван", "Миколенко", 15);


        ExelentPupil exelentPupil = new ExelentPupil("Виталий", "Куманов", 16, 4.9);


        GoodPupil goodPupil = new GoodPupil("Олег", "Бойко", 14, 4.0);


        BadPupil badPupil = new BadPupil("Дмитрий", "Легкобыт", 17, 3.0);


        ClassRoom classroom = new ClassRoom();
        classroom.addPupil(pupil);
        classroom.addPupil(exelentPupil);
        classroom.addPupil(goodPupil);
        classroom.addPupil(badPupil);
        System.out.println(classroom);


    }

    private static void Task3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите '1'- если вы обычный пользователь,  '2'- если вы пользователь PRO версии, '3'- если вы пользователь EXPERT версии");

        int number = scanner.nextInt();
        System.out.println();


        switch (number) {

            case 1:
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;
            case 2:
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;
            case 3:
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();

            default:
                break;

        }


    }

}
