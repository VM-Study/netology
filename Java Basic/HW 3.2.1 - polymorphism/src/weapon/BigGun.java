package weapon;

public class BigGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Автомат ОГОНЬ: Бубубух");
    }

    @Override
    public String toString() {
        return "BigGun";
    }
}
