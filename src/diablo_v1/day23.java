package diablo_v1;

public class day23 {
    // diablo v0.5
    public static void main(String[] args){
        Barbarian b1 = new Barbarian();
        Sorcerer s1 = new Sorcerer();
        Bow windForce = new Bow();
        Axe berserkerAxe = new Axe();
        s1.setWeapon(windForce); // get weapon과 유사
        b1.setWeapon(berserkerAxe);
        s1.perform();
        b1.perform();

        s1.setWeapon(new Axe());  // 익명의 도끼 아이템을 주웠을 경우
        s1.perform();
        s1.info();
        b1.setWeapon(()-> System.out.println("신오브로 아이스볼을 발사!") );  // 이부분을 람다함수로 대체 가능 : ()=익명함수, -> = 화살표 뒤의 부분을 실행
        b1.perform();

    }

}//end of class


