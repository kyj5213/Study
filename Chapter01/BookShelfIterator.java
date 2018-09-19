package ppms.Sample.Chapter01;

/*

BookShelf 클래스의 검색을 실행하는 BookShelfIterator 클래스

BookShelfIterator를 Iterator로서 다루기 위해 Iterator 인터페이스를 구현하고 있습니다.
bookShelf 필드는 BookShelfIterator가 검색할 서가이고, index 필드는 현재 주목하고 있는 책을 가리키는 첨자입니다.

생성자에서 전달된 BookShelf의 인스턴스를 bookShelf 필드에 저장하고 index를 0으로 합니다.
hasNext 메소드는 Iterator 인터페이스에서 선언되어 있는 메소드를 구현한 것입니다.
'다음 책'이 있는지를 조사해서 있으면 true, 없으면 false를 반환합니다.
다음 책이 있는지 없는지는 index가 서가에 있는 책의 권수(식 bookShelf.getLenght()의 값)보다 작은지, 큰지로 판정합니다.

next 메소드는 현재 처리하고 있는 책(Book의 인스턴스)을 반환하고, 다시 '다음'으로 진행시키기 위한 메소드입니다.
Iterator 인터페이스에서 선언되어 있는 메소드로써 조금 복잡합니다. 우선 반환값으로 반환해야 할 책을 book이라는 변수로 저장해 두고 index를 다음으로 진행시킵니다.

'index를 다음으로 진행'시키는 처리는 서두에서 언급한 for문의 i++에 해당하는 처리입니다. 루프변수를 '다음'으로 진행시킨 것입니다.

 */

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	// 최후의 요소를 얻기 전에는 true 값을 반환하지만, 최후의 요소를 얻은 후에는 false값을 반환합니다.
	// 주의해서 작성하지 않으면 최후의 1개를 반환하지 못할 위험이 있습니다.
	// '다음에 next 메소드를 불러도 괜찮은지를 조사하는 것'이라고 기억해두면 좋을 것입니다.
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	
	// returnCurrentElementAndAdvanceToNextPosition
	// '현재의 요소를 반환하면서, 다음 위치로 진행'하는 것입니다.
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}