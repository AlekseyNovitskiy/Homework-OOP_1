import java.time.LocalDateTime;

public class Human {
    int currentYear= LocalDateTime.now().getYear();
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human() {
    }

    public void conclusion() {
        System.out.println("Привет! Меня зовут "+ name+ ". Я из города "
                + getTown()+ ". Я родился в "+ getYearOfBirth()+
                " году. Я сейчас нигде "+jobTitle+". Будем знакомы!");
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
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = currentYear - yearOfBirth;
        }


        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

    }
    public String toString() {
        return "Привет! Меня зовут "+ name+ ". Я из города "
                + getTown()+ ". Я родился в "+ getYearOfBirth()+
                " году. Я работаю на должности "+jobTitle+". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = currentYear-yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !name.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }

    }

}
