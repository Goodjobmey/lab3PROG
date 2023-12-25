public class Emotion {
    private String name;

    public Emotion(String name){
        this.name = name;
    }

    public String fulfil(){
        System.out.print(name + " преобладал и поэтому,");
        return null;
    }
    public String showing(){
        System.out.println(" неудержимо рвался наружу");
        return null;
    }

    public String getName() {return name;}
    public String setName(String name) {this.name = name; return name; }
}
