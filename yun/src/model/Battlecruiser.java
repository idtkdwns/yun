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
		System.out.println("배틀 답게 공격하다");
	}
}
