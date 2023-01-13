package weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пистолет ОГОНЬ: Пив-Пав!");
    }

    @Override
    public String toString() {
        return "Pistol";
    }
}
