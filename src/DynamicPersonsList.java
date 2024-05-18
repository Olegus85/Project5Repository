import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicPersonsList {
    static Random random = new Random();
    static List<String> names = List.of("Anton", "Michael","Lena","Oleg","Dmitry","Olga");
    static List<Person> personList = listOfPersons();

    public static String getRandomName(){
        int x = random.nextInt(names.size());
        return names.get(x);
    }
    public static int getRandomAge(){
        int randomAge = random.nextInt(4,66);
        return randomAge;
    }
    public static List<Person> listOfPersons(){
        int numberOfPersons = random.nextInt(10,20);
        List<Person> personList = new ArrayList<>();
        for (int i=0;i<numberOfPersons;i++){
            personList.add(new Person(getRandomName(),getRandomAge()));
        }
        return personList;
    }
    public static void showLists(){
         List<Person> toKindergartenList = new ArrayList<>();
         List<Person> toSchoolList = new ArrayList<>();
         List<Person> toWorkList = new ArrayList<>();

        for(Person person: personList){
            if(person.getAge()<7)
                toKindergartenList.add(person);
            else if(person.getAge()>=7&&person.getAge()<19)
                toSchoolList.add(person);
            else toWorkList.add(person);
        }
        System.out.println("To Kindergarten(age<7): "+toKindergartenList);
        System.out.println("To School(age 7 to 18): "+toSchoolList);
        System.out.println("To Work(age 19+): "+toWorkList);

    }
    public static void main(String[] args) {
        showLists();
    }
}
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Возраст не может быть отрицательным!!");
    }
    @Override
    public String toString(){
        return name+" "+age;
    }

}
