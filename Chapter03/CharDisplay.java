package ppms.Sample.Chapter03;

/*
CharDisplay 클래스의 open, print, close 메소드의 처리
	open	: 문자열 "<<"을 표시한다
	print	: 생성자에서 주어진 1문자를 표시한다
	close	: 문자열 ">>"을 표시한다
 */

public class CharDisplay extends AbstractDisplay { // CharDisplay는 AbstractDisplay의 하위클래스
	private char ch;				// 표시해야 할 문자.
	public CharDisplay(char ch) { 	// 생성자에서 전달된 문자 ch를
		this.ch = ch;				// 필드에 기억해둔다.
	}
	public void open() {		// 상위 클래스에서는 추상 메소드였다.
								// 여기에서 오버라이드해서 구현하다.
		System.out.print("<<");	// 개시 문자열 "<<"을 표시한다.
	}
	public void print() {		// print 메소드도 여기에서 구현한다.
								// 이것이 display에서 반복해서 호출된다.
		System.out.print(ch);	// 필드에 기억해 둔 문자를 1개 표시한다.
	}
	public void close() {			// close 메소드도 여기에서 구현한다.
		System.out.println(">>");	// 종료 문자열 ">>"을 표시.
	}
}
