package model;

public class Tank extends Unit{//��� ����
	public Tank() {
		this.hp =150;
	}
	public void changeMode() {
		System.out.println("��庯��");
	}
	@Override
		public void attack() {
			System.out.println("��ũ��� �����ϴ�");
		}
}
