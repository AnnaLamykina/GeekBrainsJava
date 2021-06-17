public class Employee {
    private String fio;
    private String position;
    String email;
    String numberPnone;
    int  zarplata;
    int age;

   Employee(String fio, String position, String email, String numberPnone, int  zarplata, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.numberPnone = numberPnone;
        this.zarplata = zarplata;
        this.age = age;
    }

    public void print() {
    System.out.println("ФИО: " + fio + "\n" + "Должность: " + position + "Email: " + email + "\n" + "Телефон: " + numberPnone + "\n" + "Зарплата: " + zarplata + "\n" + "Возраст: " + age);
    System.out.println("----------------------------------------------------");
    }

    public int getAge() {
       return age;
    }
}
