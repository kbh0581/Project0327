
/*
���� ��ǲ ��Ʈ�� ���� �����ڰ� ���ϴ� ������ ��Ʈ���� �����Ҽ� ������,
Ű����� ���� ǥ�� �Է� �ϵ���� �ΰ�쿣 �������� ���ϰ�
�����ϰ� �ش� os�� �����ϹǷ� ,�ڹ� �����ڴ�
os�� ���� ǥ���Է� ��Ʈ���� ���;� �Ѵ�

�ڹ��� ũ���� �� �ý��� Ŭ������ ����ƽ ���������
��has a����� ������ ��ǲ ��Ʈ�� �� in ��ü�� �ٷ� ǥ���Է½�Ʈ���� �޾Ƴ��� Ŭ�����̴�
���� ���ÿ� �׳� �ý���.�� �ϸ�ȴ�


���ڱ�� ��Ʈ�� Ŭ������ ������Ģ
�Է�: ~~Reader;
���: ~~Writer;




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
		///���ڱ�� ��Ʈ���� �ܵ����� �����ϴ°��̾ƴ϶�, �̹� ����Ʈ ��� ��Ʈ���� ������ �ϳ�.
		//���� ������ �������� �μ��� ����Ʈ ��� ��Ʈ���� �ִ´�
		InputStreamReader reader=null;		//2byte������
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