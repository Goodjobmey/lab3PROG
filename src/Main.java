import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Female frakenbok = new Female("Фрекен Бок ", "женщина ");
        Male malysh = new Male("Малыш", "ребенок");
        MagicHuman karlson = new MagicHuman("Карлсон", "мужчина в самом расцвете сил");

        BodyPart ryka = new BodyPart("ручка", "маленькая пухленькая");
        Food plushka = new Food("плюшку");
        Food plushki = new Food("плюшки");
        Food kofe = new Food("кофе");

        Emotion smeh = new Emotion("смех");
        Emotion zlost = new Emotion("злость");

        StrangeSound my = new StrangeSound("мычание");
        Street street = new Street("улицы");



        malysh.looking();
        karlson.stolingFood(plushka, ryka);
        malysh.laughing();

        smeh.fulfil();
        smeh.showing();

        frakenbok.thinking("'он самый утомительный в мире мальчик'");
        frakenbok.wantedDrink(kofe);
        frakenbok.startingEmotion(zlost);
        my.sounding(street);
        frakenbok.turnaround();
        plushki.gettingLost();



    }
}