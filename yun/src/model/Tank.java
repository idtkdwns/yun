package model;

public class Tank extends Unit{//상속 유닛
	public Tank() {
		this.hp =150;
	}
	public void changeMode() {
		System.out.println("모드변경");
	}
	@Override
		public void attack() {
			System.out.println("탱크답게 공격하다");
		}
}
