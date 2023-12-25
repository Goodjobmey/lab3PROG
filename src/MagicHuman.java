import java.util.Random;

public class MagicHuman extends Human implements Stoling{

    // мы сделаем вид, ради моего ментального здоровья, что MagicHuman могут быть только мужчины

    public MagicHuman(String name, String age){
        super(name, age);
    }



    public String stolingFood(Food food, BodyPart bodyPart) {
        Random random = new Random();

        System.out.println(bodyPart.getCharacteristic() + " " + bodyPart.getName() + " стащила с блюдца ещё одну " + food.getName());
        return null;
    }


    @Override
    public String toString(){
        return "MagicHuman";
    }
}