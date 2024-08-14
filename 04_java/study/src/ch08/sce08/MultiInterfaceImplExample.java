package ch08.sce08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {

        RemoteControl rc = new SmartTelevision();
        rc.turnOff();
        rc.turnOn();

        Searchable searchable = new SmartTelevision();
        searchable.search("www.youtube.com");

    }
}
