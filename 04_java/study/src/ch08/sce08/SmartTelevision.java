package ch08.sce08;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOn(){
        System.out.println("SmartTelevision truning on");
    }

    @Override
    public void turnOff(){
        System.out.println("SmartTelevision truning off");
    }

    @Override
    public void search(String url) {
        System.out.println("SmartTelevision searching " + url);
    }
}
