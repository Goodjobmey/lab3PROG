public class Human{
    private String name;
    private String age;
    private BodyPart bodyPart;
    private Emotion emotion;

    public Human(String name, String age){
        this.age=age;
        this.name=name;
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}

    @Override
    public String toString(){
        return "Human";
    }

}
