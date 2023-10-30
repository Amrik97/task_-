// Класс main для запуска программы
public class main {
    public static void main(String[] args) {
        database database = new database();
        menu menu = new menu(database);
        menu.displayMenu();
    }
}
