package model;

public class Battlecruiser extends AirUnit{
	public Battlecruiser() {
		this.hp=500;
	}
	public void yamato() {
		System.out.println("yamato!");
	}
	@Override
	public void attack() {
		System.out.println("��Ʋ ��� �����ϴ�");
	}
}
