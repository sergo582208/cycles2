import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

   public static void task1() {
       int moNey = 15000;
       int total = 0;

       while (total < 2_459_000) {
           total += total / 100;
           total += moNey;
           for(int i = 0; i < 12 ; i++) {
               System.out.println("Месяц " + i + " сумма накоплений равна " + total);
           }

       }

    }

    public static void task2() {
        int i = 1;
        for (int x = 10; x > 0; x--) {
            System.out.print(" " + x);
        }
        System.out.println();
        while (i < 10) {
            System.out.print(" " + i);
            i++;
            {

            }

        }
    }
        public static void task3() {
        int populationOfTheCountry = 12_000_000;
        int borning = 17;
        int mortality = 8;
        int populationGrowth = borning - mortality;


        for(int year = 1; year <=10; year++){
            populationOfTheCountry += populationOfTheCountry/1000*populationGrowth;
            System.out.println();
            System.out.println("Год " + year + ", численность населения составляет " + populationOfTheCountry);
        }
    }

    public static void task4() {
        long moNey = 15000;
        long total = 0;
        long i = 0;
        for (;total < 12_000_000;i++) {
            total += total / 100 * 0.07;
            total += moNey;
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }
    }

    public static void task5() {
        long moNey = 15000;
        long total = 0;
        long i = 0;
        for (;total < 12_000_000;i++) {
            total += total / 100 * 0.07;
            total += moNey;
            if(i % 6 == 0)
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }

    }

    public static void task6() {
        long moNey = 15000;
        long total = 0;
        long i = 0;
        for (;total < 12_000_000;i++) {
            total += total / 100 * 0.07;
            total += moNey;
            if(i % 6 == 0 && i<=108)
            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }

    }

    public static void task7() {
        for(int i = 1; i < 31; i++ ){
            if(i%7 ==0){
                System.out.println("Сегодня пятница," + i + " -е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        int currentYear = 2023;
        int fromYear = currentYear - 200;
        int totalYear = currentYear + 100;

        for(int i = fromYear; i<totalYear; i++){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
    }
}