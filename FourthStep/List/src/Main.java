import java.util.*;

public class Main {
    private static ArrayList<Person> people;
    private static LinkedList<Book> books;
    private static LinkedList<Book> books2;

    public static void main(String[] args) {
        // Array List
        /*
        * Store any primitive data type or even an object.
        **/

        people = new ArrayList<Person>();

        people.add(Person.createPerson("Fathil Arham", 18));
        people.add(Person.createPerson("Fikri Azami", 16));
        people.add(Person.createPerson("Faid Ahsanandaru", 4));
        people.add(Person.createPerson("Will be removed person", 99));

        people.remove(3);

        for (int i = 0; i < people.size(); i++){
            Person person = people.get(i);
            System.out.println((i+1) + ". " +
                    person.getName() +
                    "(" + person.getAge() + ")");
        }

        // Linked List
        /*
        * Store any primitive data type or even an object.
        * Could be a good option to choose when we face a big data.
        * Each list has next address of its element, so when we remove or add a data-
        * it doesn't have to loop all of the element to rearrange the order. It just-
        * change the next address
        **/
        System.out.println();

        books = new LinkedList<Book>();
        books.add(Book.createBook("The Jungle", "Evan William"));
        books.add(Book.createBook("How to Crack Code Interview", "John Cena"));
        books.add(Book.createBook("Beat your Ego", "Elizabeth Cyntia"));
        books.add(Book.createBook("Will be removed book", "xxx"));

        books.add(1, Book.createBook("Second Book", "Secondary"));

        books.remove(3);

        for (int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            System.out.println((i+1) + ". " +
                    book.getTitle() +
                    "(" + book.getAuthor() + ")");
        }

        /* Another way to print LinkedList with Iterator */
        System.out.println();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getTitle() +
                    "(" + book.getAuthor() + ")");
        }

        /* Another way to print LinkedList with ListIterator
        *  ListIterator can do add element in that position.
        **/
        System.out.println();

        books2 = new LinkedList<Book>();
        books2.add(Book.createBook("Apple with Apple", "John Mayer"));
        books2.add(Book.createBook("Be an Ape", "Bill Board"));
        books2.add(Book.createBook("Calm & Respect", "Din Oswald"));

        String newTitle = "Ban the Game";
        String newAuthor = "Lisa Ariana";

        ListIterator<Book> listIterator = books2.listIterator();
        while (listIterator.hasNext()){
            int comparison = listIterator.next().getTitle().compareTo(newTitle);
            if(comparison == 0){
                System.out.println("It already added");
                break;
            }else if(comparison > 0){
                listIterator.previous();
                listIterator.add(Book.createBook(newTitle, newAuthor));
                break;
            }
        }

        listIterator = books2.listIterator();
        while(listIterator.hasNext()){
            Book book = listIterator.next();
            System.out.println(book.getTitle() + "(" + book.getAuthor() + ")");
        }
    }
}
