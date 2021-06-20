class Person {
    String name,address;
    final String country = "Indonesia";

    Person(String paramNama, String paramAddress){
        name = paramNama;
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My Name is " + name);
    }
}
