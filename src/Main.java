public class Main {
    public static void main(String[] args) {
        int a = 0;
        while (a<10){
            System.out.print(++ a + " ");
        }
        System.out.println();
        for (;a > 0;a --){
            System.out.print(a+ " ");
        }
        System.out.println();

        //Задача 2
        int fridayOne= 5;
        for (int necessaryFriday =fridayOne;necessaryFriday<=31;necessaryFriday+=7){
            System.out.println("Сегодня пятница " + necessaryFriday + "-е число.Нужно подготовить отчет");
        }
        // Задача 3
        System.out.println();
        int oneYear = 2022-200;
        int lastYear = 2022+100;

        for(;oneYear<=lastYear;oneYear++){
            if (oneYear% 79==0)
                System.out.println(oneYear);
        }


        }
    }

