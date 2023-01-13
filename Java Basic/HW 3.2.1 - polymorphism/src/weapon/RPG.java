package weapon;

public class RPG extends Weapon {
    @Override
    public void shot() {
        System.out.println("РПГ ОГОНЬ: ВЗРЫВ!");
    }

    @Override
    public String toString() {
        return "RPG";
    }
}
