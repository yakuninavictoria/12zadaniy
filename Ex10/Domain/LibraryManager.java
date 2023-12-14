package Ex10.Domain;

public class LibraryManager {
    Searching searching;
    MakingOrder makingOrder;
    CheckingBook checkingBook;

    public LibraryManager() {
        this.searching = new Searching();
        this.makingOrder = new MakingOrder();
        this.checkingBook = new CheckingBook();
    }

    public void searchBook() {
        searching.searchBook();
        searching.showResult();
    }

    public void makeOrder() {
        makingOrder.createOrder();
        makingOrder.addBooksToOrder();
        makingOrder.payOrder();
        makingOrder.sendCheck();
    }

    public void checkBook() {
        checkingBook.checkBook();
        checkingBook.showResult();
    }
}
