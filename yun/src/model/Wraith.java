package model;

public class Wraith extends AirUnit{
	public Wraith() {
		this.hp=120;
	}
	public void cloaking() {
		System.out.println("cloaking!");
	}
	@Override
	public void attack() {
		System.out.println("���̽� ��� �����ϴ�");
	}
}
