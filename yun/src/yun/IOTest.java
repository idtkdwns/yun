package yun;
import java.io.*;
//java.io.*��Ű��
//inputStream �޸� ������ �鿩������:Scanner(system.in)
//OutputStream-�޸𸮸� �����ϰų� ������ ��������: System.out.println()
public class IOTest {
	static String fileName="test.txt";
	//�ٰ��̰����ϴ� ������
	static FileInputStream fis=null;
	//FileInputStream:�ٸ� �Է�Ŭ������ �����ؼ� ���Ͽ��� �����͸��аų���������,�� ���� ������ ���� �� ����
	public static void main(String[] args) {
	//������ �����ϴ� ����ִ� ����
	//���ϸ��� �����ϸ� ��� ��ü������ �����Ҽ� ������ �ڹٰ� ������ �Ǵ� ���� ���ǵǴ� �����ִ� ���̾��� �Լ�(�������� ���ڿ� �����Ͱ� ���� �������)
		try {
			fis=new FileInputStream(fileName);
			//���ο� Ŭ���� ����
			/*do {
				System.out.print((char)fis.read());//read:�ѱ��ڸ������Ѵ�
			}while (fis.read() != -1);*/
			int tmp=0;
			while((tmp=fis.read())!= -1){
				//-1�� �ƴҶ����� �о��ּ���, KOSTA KSA �������ʿ�KOSTA
				System.out.print((char)tmp);//���ڿ� ���
			}//������ �߻� �� �� �ִ��ڵ�
		}	catch (FileNotFoundException e) {//���� ���
			System.out.println("FileNotFoundException �߻�");
		}catch(IOException e) {
			System.out.println("IOException �߻�");
		}finally {
			try {
				fis.close();
				//����
			}catch (IOException e) {
				System.out.println("file.close():���ܹ߻�");
			}
		}
	}
}
