package ppms.Sample.Chapter06;

import ppms.Sample.Chapter06.framework.*;

/*

Main 클래스에서는 우선 Manager의 인스턴스를 만듭니다.
그리고 Manager의 인스턴스에 대해서 UnderlinePen의 인스턴스와 MessageBox의 인스턴스에 이름을 붙여서 등록합니다.

Manager에 등록하는 내용
이름					클래스와 인스턴스의 내용
"strong message"	UnderlinePen에서 ulchar가 '~'
"warning box"		MessageBox에서 decochar가 '*'
"slash box"			MessageBox에서 decochar가 '/'

 */

public class Main {
	public static void main(String[] args) {
		//준비
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: Manager manager = new Manager();");
		Manager manager = new Manager();
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: UnderlinePen upen = new UnderlinePen('~');");
		UnderlinePen upen = new UnderlinePen('~');
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: MessageBox mbox = new MessageBox('*');");
		MessageBox mbox = new MessageBox('*');
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: MessageBox sbox = new MessageBox('/');");
		MessageBox sbox = new MessageBox('/');
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: manager.register('strong message', upen);");
		manager.register("strong message", upen);
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: manager.register('warning box', mbox);");
		manager.register("warning box", mbox);
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: manager.register('slash box', sbox);");
		manager.register("slash box", sbox);
		
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		
		//생성
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: Product p1 = manager.create('strong message');");
		Product p1 = manager.create("strong message");
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: p1.use('Hello, world.');");
		p1.use("Hello, world.");
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: Product p2 = manager.create('warning box');");
		Product p2 = manager.create("warning box");
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: p2.use('Hello, world.');");
		p2.use("Hello, world.");
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: Product p3 = manager.create('slash box');");
		Product p3 = manager.create("slash box");
		System.out.println("* * * * * * * * * * * * * * * * * * * * Main: p3.use('Hello, world.');");
		p3.use("Hello, world.");
	}
}
