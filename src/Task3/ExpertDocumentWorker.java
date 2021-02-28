package Task3;

public class ExpertDocumentWorker extends ProDocumentWorker{





public void saveDocument(){
    System.out.println("Желаете ли вы сохранить документ в новом формате?  1 - Да    2 - Нет");
    int a =scanner.nextInt();
    if (a==1){

        System.out.println("Веберите формат  1-txt   2-doc   3-pdf");
        int c =scanner.nextInt();
         switch (c){
             case 1:
                 System.out.println("Документ сохранен в новом формате TXT");
                 break;
             case 2:
                 System.out.println("Документ сохранен в новом формате DOC");
                 break;
             case 3:
                 System.out.println("Документ сохранен в новом формате PDF");
                 break;
             default:
                 System.out.println("Документ сохранен в старом формате формате");
                 break;
         }

    }




}




}
