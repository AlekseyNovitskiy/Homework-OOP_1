public class Human {
    int currentYear=2022;
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human() {
    }

    void conclusion() {
        System.out.println("Привет! Меня зовут "+ name+ ". Я из города "
                + town+ ". Я родился в "+ (currentYear-yearOfBirth)+
                " году. Я работаю на должности "+jobTitle+". Будем знакомы!");
    }
    public Human(String name,String town,int yearOfBirth,String jobTitle) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (yearOfBirth < 0) {
            this.currentYear = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

    }
    public String toString() {
        return "Привет! Меня зовут "+ name+ ". Я из города "
                + town+ ". Я родился в "+ (currentYear-yearOfBirth)+
                " году. Я работаю на должности "+jobTitle+". Будем знакомы!";
    }
}
