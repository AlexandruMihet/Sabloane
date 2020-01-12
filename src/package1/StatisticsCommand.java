package package1;

public class StatisticsCommand implements Command {
    protected Book myBook;
    public StatisticsCommand(Book book){
        myBook=book;
    }
    @Override
    public void execute() {

        BookStatistics stats = new BookStatistics();
        if(myBook!=null) myBook.accept(stats);
        stats.print();
    }
}