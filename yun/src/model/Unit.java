package model;

abstract public class Unit {//추상클래스,java파일에 a가붙음
	public int hp;
	public int x;
	public int y;
	abstract public void attack();//공공의 비어있는 추상 메소드
	public void move() {
		System.out.println("움직이다");
	}
	public void stop() {
		System.out.println("멈추다");
	}
}
