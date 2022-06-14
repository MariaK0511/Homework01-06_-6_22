package strings_task1;

public class Main {
    public static void main(String[] args)  {
        /*
        1.Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа). +
Номер документа имеет формат хххх-ууу-хххх-ууу-хуху, где х - это число, а у - это буква.
-Вывести на экран в одну строку два первых блока по 4 цифры. +
-Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *). +
-Вывести на экран только одни буквы из номера документа в формате yyy/yyy/у/у в нижнем регистре. +
-Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/у/у" в верхнем регистре(реализовать с помощью класса StringBuilder). +
-Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и AВС считается одинаковой последовательностью). +
-Проверить начинается ли номер документа с последовательности 555. +
-Проверить заканчивается ли номер документа на последовательность 1a2b. +
Все эти методы реализовать в отдельном классе в статических методах, +
которые на вход (входным параметром) будут принимать вводимую на вход программы строку. +
         */
        String numDoc = "2345-Ert-6685-sVM-9g7X";
        Realization.Substring(numDoc);
        Realization.Replace(numDoc);
        Realization.Extraction(numDoc);
        Realization.lettersExtraction(numDoc);
        try {
            Realization.sequenceOfString(numDoc);
        } catch (SequenceException e) {
            e.getMessage();
        }
        try {
            Realization.beginningOfString(numDoc);
        } catch (BeginningStringException e) {
            e.getMessage();
        }
        try {
            Realization.endString(numDoc);
        } catch (EndStringException e) {
            e.getMessage();
        }
    }
}
