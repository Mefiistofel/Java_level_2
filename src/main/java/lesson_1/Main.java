package lesson_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);
        actions[0] = new Human("Fry", distance, height);

        distance = rand.nextInt(30);
        height = rand.nextInt(10);
        actions[1] = new Robot("Bender", distance, height);

        distance = rand.nextInt(15);
        height = rand.nextInt(20);
        actions[2] = new Cat("Lucky", distance, height);

        Barrier[] barriers = new Barrier[4];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Дорожка: " + i, distance);
            } else {
                barriers[i] = new Wall("Препятствие: " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("ПОБЕДА!!!");
            } else {
                System.out.println("ПРОВАЛ!");
            }
        }
    }
}
