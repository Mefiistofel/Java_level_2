package lesson_1;

// Преграда

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " (Высота: " +  this.height +")");

        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Успешно.");

            return true;
        } else {
            System.out.println("Неуспешно.");

            return false;
        }
    }
}
