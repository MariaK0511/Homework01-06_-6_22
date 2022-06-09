package strings_task1;

import java.util.Arrays;

public class Realization {

    public static void Substring(String numDoc) {
        System.out.println(numDoc.substring(0, 4) + numDoc.substring(9, 13));
    }

    public static void Replace(String numDoc) {
        System.out.println(numDoc.replace("Ert", "***").replace("sVM", "***"));
    }

    public static void Extraction(String numDoc) {
        System.out.println(numDoc.toLowerCase().substring(5, 8) + "/" + numDoc.toLowerCase().substring(14, 17) + "/"
                + numDoc.toLowerCase().charAt(19) + "/" + numDoc.toLowerCase().substring(21));
    }

    public static void lettersExtraction(String numDoc) {
        StringBuilder sb = new StringBuilder(numDoc.toUpperCase());
        System.out.println("Letters:" + sb.substring(5, 8) + "/" + sb.substring(14, 17) + "/" +
                sb.substring(19, 20) + "/" + sb.substring(21));
    }

    public static void sequenceOfString(String numDoc) throws SequenceException {
        try {
            char[] chars = numDoc.toUpperCase().toCharArray();
            char[] chars2 = numDoc.toLowerCase().toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars2);
            Arrays.equals(chars, chars2);
            System.out.println(new String(chars));
        } catch (Exception e) {
            throw new SequenceException();
        }
    }
    public static void beginningOfString(String numDoc) throws BeginningStringException {
        try {
            if (numDoc.startsWith("555")) {
                System.out.println(numDoc.startsWith("555"));
            }
        } catch (Exception e) {
            throw new BeginningStringException(e);
        }
    }
    public static void endString(String numDoc) throws EndStringException {
        try {
            System.out.println(numDoc.startsWith("1a2b"));
        } catch (Exception e) {
            throw new EndStringException(e);
        }
    }
}
