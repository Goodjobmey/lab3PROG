public class Female extends BasicHuman{
    public Female(String name, String age){
        super(name, age);
    }

    public String thinking(String thought){
        System.out.println("И тогда " + getName() + " подумала: " + thought);
        return null;
    }
    public String startingEmotion(Emotion emotion){
        System.out.println("Она резко изменилась в лице, ясно было, что сейчас её переполняла " + emotion.getName());
        return null;
    }
    public String wantedDrink(Food food){
        System.out.println("А ведь она просто хотела попить " + food.getName());
        return null;
    }
    public String turnaround(){ System.out.print(getName()+ " стремительно обернулась и обнаружила, что "); return null;}

}
