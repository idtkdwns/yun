package model;

abstract public class Unit {//�߻�Ŭ����,java���Ͽ� a������
	public int hp;
	public int x;
	public int y;
	abstract public void attack();//������ ����ִ� �߻� �޼ҵ�
	public void move() {
		System.out.println("�����̴�");
	}
	public void stop() {
		System.out.println("���ߴ�");
	}
}
