package Task3;

import java.util.Scanner;

public class ProDocumentWorker extends  DocumentWorker{


  public   void editDocument(){

      System.out.println("Желаете ли вы редактировать документ?  1 - Да    2 - Нет");
      int a =scanner.nextInt();

      if (a==1){

          System.out.println("Введите текст заново");
          Scanner scanner = new Scanner(System.in);
         String d =scanner.nextLine();

          System.out.println("Документ отредактирован");
      }
    }
   public void saveDocument(){
       System.out.println("Желаете ли вы сохранить документ?  1 - Да    2 - Нет");
       int a =scanner.nextInt();

       if (a==1){
           System.out.println("Документ сохранен в старом формате. Сохранение в остальных форматах доступно в версии Эксперт");
       }




    }




}
