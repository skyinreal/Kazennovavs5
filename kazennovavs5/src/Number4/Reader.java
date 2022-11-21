package Number4;

public class Reader {
    private String FIO;
    private String number;
    private String facultetus;
    private String birth;
    private String telephone;

    public Reader(String FIO) {
        this.FIO = FIO;
    }

    public void takeBook(String n){
        System.out.println(FIO+" взял" + " " + n +" " + "книг(и)");
    }
    public void takeBook(String[] name){
        System.out.println(FIO+" взял книги:"+" ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+ " ");

        }
    }
    public void takeBook(Book[] books){
        System.out.println(FIO+" взял книги:"+" ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getNameBook()+ " ");

        }
    }

    public void returnBook(String n){
        System.out.println(FIO+" вернул" + " " + n +" " + "книг(и)");
    }
    public void returnBook(String[] name){
        System.out.println(FIO+" вернул книги:"+" ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+ " ");

        }
    }
    public void returnBook(Book[] books){
        System.out.println(FIO+" вернул книги:"+" ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getNameBook()+ " ");

        }
    }

}
