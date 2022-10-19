import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        /*
        // Задание 1.
        System.out.println("Задание 1");

        Human maksim = new Human();
        maksim.yearOfBirth = 35;
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.jobTitle = "бренд-менеджер";
        maksim.conclusion();

        Human anya = new Human();
        anya.yearOfBirth = 29;
        anya.name = "Аня";
        anya.town = "Москва";
        anya.jobTitle = "методист образовательных программ";
        anya.conclusion();

        Human katia = new Human();
        katia.yearOfBirth = 28;
        katia.name = "Катя";
        katia.town = "Калининград";
        katia.jobTitle = "продакт-менеджер";
        katia.conclusion();

        Human artem = new Human();
        artem.yearOfBirth = 27;
        artem.name = "Артем";
        artem.town = "Москва";
        artem.jobTitle = "директор по развитию бизнеса";
        artem.conclusion();

         */


        // Задание 2.
        System.out.println("Задание 2");

        Human maksim2 = new Human("Максим","Минск",35,"бренд-менеджер");
        Human anya2 = new Human("Аня","Москва",29,"методист образовательных программ");
        Human katia2 = new Human("Катя","Калининград",28,"продакт-менеджер");
        Human artem2 = new Human("Максим","Минск",27,"директор по развитию бизнеса");

        System.out.println(maksim2);
        System.out.println(anya2);
        System.out.println(katia2);
        System.out.println(artem2);


        // Задание 3.
        System.out.println("Задание 3");

        Human maksim3 = new Human(null,"Минск",35,"бренд-менеджер");
        Human anya3 = new Human("Аня",null,29,"методист образовательных программ");
        Human katia3 = new Human("Катя","Калининград",28,null);
        Human artem3 = new Human("Максим","Минск",-27,"директор по развитию бизнеса");

        System.out.println(maksim3);
        System.out.println(anya3);
        System.out.println(katia3);
        System.out.println(artem3);


        // ООП. УРОК 2. Задание 1.1
        System.out.println("ООП. УРОК 2.  Задание 1.1");

        Human vladimir = new Human("Владимир","Казань",21,"не работаю");
        vladimir.conclusion();
        vladimir.setTown(null);
        vladimir.setYearOfBirth(-23);
        vladimir.conclusion();

        // ООП. УРОК 2. Задание 1.2
        System.out.println("ООП. УРОК 2.  Задание 1.2");

        Flower rose = new Flower("Роза обыкновенная",null,"Голландия",35.59,0);
        Flower chrysanthemum = new Flower("Хризантема", null,null,15,5);
        Flower pion = new Flower("Пион",null,"Англия",69.9,1);
        Flower gypsophila = new Flower("Гипсофила",null,"Турция",19.5,10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);
        Flower[] flowers = {rose,rose,rose,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,gypsophila};
        printBouquet(flowers);
    }

    private static void printBouquet(Flower[] flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        int countRose = 0;
        int countChrysanthemum = 0;
        int countPion = 0;
        int countGypsophila = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flowers[i].lifeSpan;
            }
            if (flowers[i].name.equals("Роза обыкновенная")) {
                countRose++;
            }
            else if (flowers[i].name.equals("Хризантема")) {
                countChrysanthemum++;
            }
            else if (flowers[i].name.equals("Пион")) {
                countPion++;
            }
            else if (flowers[i].name.equals("Гипсофила")) {
                countGypsophila++;
            }

                totalCost += flowers[i].getCost();

        }
        totalCost*=1.1;
        System.out.print("Букет состоит из: ");
        if (countRose > 0) {
            System.out.print(countRose + " роз, ");
        }
        if (countChrysanthemum > 0) {
            System.out.print(countChrysanthemum +  " хризантем, ");
        }
        if (countPion > 0) {
            System.out.print(countPion +  " пионов, ");
        }
        if (countGypsophila > 0) {
            System.out.print(countGypsophila +  " гипсофил. ");
        }
        System.out.println();
        String resultCost = String.format("%.2f",totalCost);
        System.out.println("Стоимость букета "  + resultCost+", срок стояния букета "+minimumLifeSpan+" дня.");

    }

}