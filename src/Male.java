import java.util.Random;

public class Male extends BasicHuman implements Laughing{

    // я замечу, что сильно упрощаю себе раюоту с интерфейсами определяя их к одноименным класам, ведь по сути все люди умеют смеятся, НО В МОЕЙ ВСЕЛЕННОЙ все будет иначе...
    public Male(String name, String age){
        super(name, age);
    }



    public String looking() {
        System.out.print("И тут он увидел, как ");
        return null;
    }

    @Override
    public boolean laughing() {
        Random random = new Random();
        System.out.println(getName() + " хихикнул: " + Sound.xexexe);
        if (random.nextBoolean()){System.out.println("И тут его разорвало: " + Sound.XAXAXA);}
        return false;
    }

    @Override
    public String toString(){
        return "Male";
    }
}
