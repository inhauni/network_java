package diablo_v1;

public abstract class Character {
    protected int hp;
    protected int mp;


    WeaponBehavior weapon;  // Association(Aggregation) :weapon과 character는 종속(의존)된 것이 아니고 연관된 것이기 때문에 character에 어떠한 경우의 수가 추가되어도 영향을 받지 X


    abstract void info(); // 자식 class에서 override하는 부분

    public void setWeapon(WeaponBehavior weapon) { // WeaponBehavior를 implements 하고 있는 모든 하위 클래스가 대입 가능
        this.weapon = weapon; // 이 때의 this는 character의 객체
    }

    // final: class 앞 -> 상속불가(마지막 class), method 앞 -> 자식 class 에서 고쳐쓸 수 없다. , field 앞 -> 상수 취급 되어 바꿀 수 없다
    public final void perform(){
        weapon.useWeapon();
    }
}
