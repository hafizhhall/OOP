public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager();
        manager.name = "Hafizh";
        manager.sayHello("Andika");

        var vp = new VicePresident();
        vp.name = "Setiawan";
        vp.sayHello("Andika");
        
    }
}
