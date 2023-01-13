import weapon.*;

public class Player {
    // Указываем тип данных weapon.Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new BigGun(),
                new WaterPistol(),
                new Pistol(),
                new RPG(),
                new Slingshot(),
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public Weapon[] getWeaponSlots() {
        return weaponSlots;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot < 0 || slot >= getSlotsCount()) {
            System.out.println("Номер оружия введет не верно");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
