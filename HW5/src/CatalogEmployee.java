public class CatalogEmployee {

    public static void main(String[] args){

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Петров Петр Петрович", "Ведущий инженер", "petr@mail.ru", "+70123456890", 80000, 41);
        employeeArray[1] = new Employee("Сидорова Александра Дмитриевна", "Главный инженер", "alexandra@mail.ru", "+70987654321", 100000, 49);
        employeeArray[2] = new Employee("Иванов Иван Иванович", "Инженер 1 категории", "ivan@mail.ru", "+71234509876", 66000, 34);
        employeeArray[3] = new Employee("Кулаков Олег Игоревич", "Начальник отдела", "oleg@mail.ru", "+75432109876", 150000, 44);
        employeeArray[4] = new Employee("Спиридонова Людмила Витальевна", "Инженер 2 категории", "ludmila@mail.ru", "+76789054321", 75000, 36);


       for (int i=0; i < employeeArray.length; i++) {
           if (employeeArray[i].getAge() > 40) {
               employeeArray[i].print();
           }
       }



    }

}
