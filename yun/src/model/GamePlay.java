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
		battle.flight();//AirUnit���
		battle.yamato();
		battle.attack();//unit���
	}
	/*
	 * ���:extends
	 * �߻�:abstract
	 * �߻� Ŭ����
	 * �߻� �޼���
	 * �������̵�
	 * ��? */
}
