package yun;
import java.io.*;
//java.io.*패키지
//inputStream 메모리 안으로 들여보내기:Scanner(system.in)
//OutputStream-메모리를 저장하거나 밖으로 내보낼때: System.out.println()
public class IOTest {
	static String fileName="test.txt";
	//다같이공유하는 데이터
	static FileInputStream fis=null;
	//FileInputStream:다른 입력클래스와 연결해서 파일에서 데이터를읽거나쓸수있음,한 글자 단위를 읽을 수 있음
	public static void main(String[] args) {
	//공공의 공유하는 비어있는 메인
	//제일먼저 동작하며 어느 객체에서든 접근할수 있으며 자바가 컴파일 되는 순간 정의되는 돌려주는 값이없는 함수(연속적인 문자열 데이터가 들어가는 저장공간)
		try {
			fis=new FileInputStream(fileName);
			//새로운 클래스 생성
			/*do {
				System.out.print((char)fis.read());//read:한글자를리턴한다
			}while (fis.read() != -1);*/
			int tmp=0;
			while((tmp=fis.read())!= -1){
				//-1이 아닐때까지 읽어주세요, KOSTA KSA 수정이필요KOSTA
				System.out.print((char)tmp);//문자열 출력
			}//에러가 발생 할 수 있는코드
		}	catch (FileNotFoundException e) {//강제 출력
			System.out.println("FileNotFoundException 발생");
		}catch(IOException e) {
			System.out.println("IOException 발생");
		}finally {
			try {
				fis.close();
				//종료
			}catch (IOException e) {
				System.out.println("file.close():예외발생");
			}
		}
	}
}
