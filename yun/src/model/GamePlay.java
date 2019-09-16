package model;

public class GamePlay {
	public static void main(String[] args) {
		Tank tank =new Tank();
		System.out.println(tank.hp);
		tank.changeMode();
		
		Marine marine=new Marine();
		System.out.println(marine.hp);
		marine.steamPack();
		
		//Unit u = new Unit();
		
		Battlecruiser battle = new Battlecruiser();
		battle.flight();//AirUnit상속
		battle.yamato();
		battle.attack();//unit상속
	}
	/*
	 * 상속:extends
	 * 추상:abstract
	 * 추상 클래스
	 * 추상 메서드
	 * 오버라이딩
	 * 왜? */
}
