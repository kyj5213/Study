package ppms.Sample.Chapter03;

/*
AbstractDisplay 클래스는 open, print, close, display라는 메소드를 가지고 있습니다.
이중에서 open, print, close는 추상 메소드이고 display 메소드만이 구현되고 있습니다.
AbstractDisplay 클래스에 쓰여있는 display 메소드의 정의를 읽어 보면 다음과 같은 처리를 실행하고 있습니다.
	. . . open 메소드를 호출
	. . . print 메소드를 5회 호출
	. . . close 메소드를 호출
AbstractDisplay 클래스를 읽어 보면, 이 세 가지 메소드는 추상 메소드이기 때문에 
AbstractDisplay가 '실제로' 무엇을 하고 있는지 AbstractDisplay 클래스만 보고서는 알 수 없습니다.
실제로 무엇을 하고 있는가는 open, print, close를 구현하는 하위 클래스에게 맡기고 있습니다.
 */
public abstract class AbstractDisplay { // 추상 클래스 AbstractDisplay
	public abstract void open(); 	// 하위 클래스에 구현을 맡기는 추상 메소드(1) open
	public abstract void print();	// 하위 클래스에 구현을 맡기는 추상 메소드(2) print
	public abstract void close(); 	// 하위 클래스에 구현을 맡기는 추상 메소드(3) close
	public final void display() { 	// 추상 클래스에서 구현되고 있는 메소드 display
		System.out.println("# # # # # # # # # # AbstractDisplay display()");
		open();						// 우선 open하고...
		for (int i = 0; i < 5; i++) {	// 5번 print를 반복하고...
			print();
		}
		close();					// ... 마지막으로 close한다. 이것이 display에서 구현되고 있는 내용.
	}
}
