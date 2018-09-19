package ppms.Sample.Chapter01;

import java.util.ArrayList;

/*

Main 클래스를 이용해서 작은 서가를 만들어봅시다.

우선 책이 4권 들어가는 서가를 만듭니다. 그리고 순서대로
    . . . Around the World in 80 Days (80일간의 세계일주)
    . . . Bible (성서)
    . . . Cinderella (신데렐라)
    . . . Daddy-Long-Legs (키다리 아저씨)
라는 4권의 책을 만들어 넣었습니다. 
책 이름은 순서를 알기 쉽도록 첫 글자의 A, B, C. . . 알파벳 순서로 하였습니다.

bookShelf.iterator()에 의해 얻어지는 it가 서가를 검색하기 위한 Iterator의 인스턴스입니다.
while의 조건 부분에 쓰는 것은 물론 it.hasNext()입니다.
이것으로 책이 있는 한 while 루프가 돌아가고, 루프 내에서 it.next()에 의해 책을 한 권씩 조사하게 됩니다.

 */
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("East of Eden"));
		bookShelf.appendBook(new Book("Frankenstein"));
		bookShelf.appendBook(new Book("Gulliver's Travels"));
		bookShelf.appendBook(new Book("Hamlet"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}		
	}
}