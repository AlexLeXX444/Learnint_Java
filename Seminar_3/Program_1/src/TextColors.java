public class TextColors {
    // передаём в метод число и получаем ANSI код цвета текста строки в консоли.
    static String ConsoleColors (int numOfColors) {
        switch (numOfColors) {
            case (1):
                return "\u001B[30m"; // черный
            case (2):
                return "\u001B[31m"; // красны
            case (3):
                return "\u001B[32m"; // зеленый
            case (4):
                return "\u001B[33m"; // желтый
            case (5):
                return "\u001B[34m"; // синий
            case (6):
                return "\u001B[35m"; // фиолетовый
            case (7):
                return "\u001B[36m"; // голубой
            case (8):
                return "\u001B[37m"; // белый
            default:
                return "";
        }
    }

    // передаём в метод ANSI код цвета и получаем его название.
    static String ConsoleTextColors (String str) {
        switch (str) {
            case ("\u001B[30m"):
                return "черный";
            case ("\u001B[31m"):
                return "красный";
            case ("\u001B[32m"):
                return "зеленый";
            case ("\u001B[33m"):
                return "желтый";
            case ("\u001B[34m"):
                return "синий";
            case ("\u001B[35m"):
                return "фиолетовый";
            case ("\u001B[36m"):
                return "голубой";
            case ("\u001B[37m"):
                return "серый";
            default:
                return "стандартный";
        }
    }
}
