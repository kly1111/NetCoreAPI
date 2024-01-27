import java.util.*;

class Author{
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void In(){
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
    }
}

class Book{
    private String name;
    private double price;
    private int qty;
    public static ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Author> author = new ArrayList<>();

    public Book(){};
    public Book(String name, double price, int qty, ArrayList<Author> author) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
        bookList.add(this);
    }

    public static void sapXep(){
        Collections.sort(bookList , new Comparator<Book>(){
            public int compare(Book a, Book b){
                return a.name.compareTo(b.name);
            }
        });
    }

    public void In(){
        System.out.println("-----------------------");
        System.out.println("Book Information :");
        System.out.println("Name : " + name);
        System.out.println("Price : " + String.format("%.0f", price));
        System.out.println("Quantity : " + qty);
        System.out.println("Author Information :");
        int cnt = 1;
        for(Author x : author){
            System.out.println("#" + cnt);
            x.In();
            ++cnt;
        }
    }
}

public class mang1chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n; ++i){
            sc.nextLine();
            String tenSach = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            ArrayList<Author> arr = new ArrayList<Author>();
            int soTacGia = sc.nextInt();
            sc.nextLine();
            for(int j = 0;j < soTacGia; ++j){
                Author author = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
                arr.add(author);
            }
            Book book = new Book(tenSach , price , qty , arr);
        }
        sc.nextLine();
        Book book = new Book();
        Book.sapXep();
        for(Book value : Book.bookList){
            value.In();
        }
    }
}

