package Task3;

import java.util.Scanner;

public class DocumentWorker {
static Scanner scanner = new Scanner(System.in);

public void openDocument(){
    System.out.println("Введите текст");
    String s =scanner.nextLine();
    System.out.println("Документ открыт");

}

public void editDocument(){

    System.out.println("Желаете ли вы редактировать документ?  1 - Да    2 - Нет");
    int a =scanner.nextInt();

    if (a==1){
        System.out.println("Редактирование документа доступно в версии Про");
    }


}

public void saveDocument(){
    System.out.println("Желаете ли вы сохранить документ?  1 - Да    2 - Нет");
    int a =scanner.nextInt();

    if (a==1){
        System.out.println("Сохранение документа доступно в версии Про");
    }




}




}
