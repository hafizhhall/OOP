public class PerssonApp {
    public static void main(String[] args) {

        var person1 = new Person("Hafizh","Yogyakarta");


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Athallah");

        Person person2 = new Person("Santika");

        Person person3;
        person3 = new Person();
        person3.name = "Jajuli";
        person3.sayHello("Bari");
    }
}
