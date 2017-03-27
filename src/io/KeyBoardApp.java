
/*
파일 인풋 스트림 등은 개발자가 원하는 시점에 스트림을 생성할수 있지만,
키보드와 같은 표준 입력 하드웨어 인경우엔 제어하지 못하고
지못하고 해당 os가 관리하므로 ,자바 개발자는
os로 부터 표준입력 스트림을 얻어와야 한다

자바의 크래스 중 시스템 클래스의 스테틱 멤버변수중
즉has a관계로 보유한 인풋 스트림 형 in 객체가 바로 표준입력스트림을 받아놓은 클래스이다
따라서 사용시엔 그냥 시스템.인 하면된다


문자기반 스트림 클래스의 명명규칙
입력: ~~Reader;
출력: ~~Writer;




*/
package io;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
class  KeyBoardApp
{
	public static void main(String[] args){
		InputStream is=System.in;
			//int i;
		//is.read();
		///문자기반 스트림은 단독으로 존재하는것이아니라, 이미 바이트 기반 스트림을 전제로 하낟.
		//따라서 생성시 생성자의 인수에 바이트 기반 스트림을 넣는다
		InputStreamReader reader=null;		//2byte씩읽음
		reader=new InputStreamReader(is);	
		int data;
		try{
			
			 while(true){
				data=reader.read();
				System.out.print((char)data);
			 }
		}catch(IOException e){
		
		}
	
	}
}
