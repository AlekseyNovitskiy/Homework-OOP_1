public class Main {
    public static void main(String[] args) {

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



    }
}