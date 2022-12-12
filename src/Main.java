public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int amountP = 2459000;
        int monthA = 15000;
        int total = 0;
        int month = 1;
        double montlyP = 0.01;

        while (total <= amountP) {
            total += monthA + total * montlyP;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, total);
            month++;
        }

        System.out.println("Задание 2");
        int count = 1;
        while (count<=10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for (int i = 10; i > 0; i --) {
            System.out.print( i + " ");
        }

        System.out.println("Задание 3");
        int pop = 12_000_000;
        float birtC = (float) 17/1000;
        float deathC = (float) 8/1000;
        for (int i = 1; i < 11; i++) {
            pop = (int) (pop + (pop * birtC) - (pop * deathC));
            System.out.printf("Год %d, численность населения состовляет %d%n", i, pop);
        }

        System.out.println("Задание 4");
        int deposit = 15000;
        int totalA = 12_000_000;
        int monthC = 1;
        double monthlyPercent = 0.07;
        while (deposit <= totalA) {
            deposit += deposit * monthlyPercent;

            if (monthC % 1 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d%n", monthC, deposit);

            }
            monthC++;

        }

        System.out.println("Задание 5");
        int deposit0 = 15000;
        int totalA0 = 12_000_000;
        int monthC0 = 1;
        double monthlyPercent0 = 0.07;
        while (deposit0 <= totalA0) {
            deposit0 += deposit0 * monthlyPercent0;

            if (monthC0 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d%n", monthC0, deposit0);

            }
            monthC0++;

        }

        System.out.println("Задание 6");
        int deposit1 = 15000;
        int monthC1 = 1;
        double monthlyPercent1 = 0.07;
        int monthP1 = 9 * 12;

        while (monthC1 <= monthP1) {
            deposit1 += deposit1 * monthlyPercent1;

            if (monthC1 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d%n", monthC1, deposit1);

            }
            monthC1++;

        }

        System.out.println("Задание 7");
        int friday = 2;
        int days = 31;
        while (friday <= days) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", friday, days);
            friday += 7;
        }

        System.out.println("Задание 8");
        int yearNow = 2022;
        int start = yearNow - 200;
        int end = yearNow + 100;

        for (int i = start; i <= end; i++ ) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }



    }
}