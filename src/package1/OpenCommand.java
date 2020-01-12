package package1;

public class OpenCommand implements Command {
    protected String path;
    protected Element myBook;


    public OpenCommand(String path){
        this.path=path;
    }

    @Override
    public void execute() {
        Builder jsonBuilder = new JSONBuilder(path);
        jsonBuilder.build();
        myBook = jsonBuilder.getResult();
        Book book = new Book("Design Patterns");
        book.addAuthor("Iulian Paul");
        book.addContent(myBook);
        DocumentManager.getInstance().setBook(book);
    }

}