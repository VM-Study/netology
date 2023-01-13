package weapon;

public class Slingshot extends Weapon {
    @Override
    public void shot() {
        System.out.println("Рогатка ОГОНЬ: Клац клац");
    }

    @Override
    public String toString() {
        return "Slingshot";
    }
}
