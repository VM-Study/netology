package weapon;

public class WaterPistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Водный пистолет ОГОНЬ: Бульк");
    }

    @Override
    public String toString() {
        return "WaterPistol";
    }
}
