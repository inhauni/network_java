package diablo_v1;

public class Bow implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("바람의 힘으로 활을 발사");
    }
}
