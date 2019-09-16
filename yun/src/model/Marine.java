package model;

public class Marine extends Unit{
	public Marine(){
		this.hp=40;
	}
	public void steamPack() {
		System.out.println("steamPack");
	}
	@Override
	public void attack() {
		System.out.println("마린답게 공격하다");
	}
}
