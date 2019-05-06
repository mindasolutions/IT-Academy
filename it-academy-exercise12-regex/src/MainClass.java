import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

    public static void main(String[] args) {
//        test("\\b[tT]rue\\b", "true True atrue bTrue");
//        test("\\b\\w{3}\\b", "wet cat duc pin euro");
//        test("\\b[\\d].*?\\b", "555 4re 5 java course");
//        test("\\b[^\\d\\s].+?\\b", "cat something 2pcs");
//        test("\\b[\\D\\s].+?\\b", "cat something 2pcs"); // FIXME why that is wrong?
//        test("\\b[12]?[0-9]{1,2}\\b", "234 111 222 345 553");
//        test("\\b[\\w\\.]*?@\\w*?\\..*?\\w\\b", "joe.doe@gmail.com info@outlook.uk jan@kowalski jan.kowalski.gmail");
//        test("(\\d+?) \\1\\b", "11 11 123 123 33 32");
//        test("((a{1}|a{4})b)+", "aaababaaaabbbb");
//        test("a+?b", "aaababaaaabbbb");
    }

    public static void test(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int matches = 0;

        System.out.println(new StringBuilder()
                .append("Input string = '").append(input).append("'. ")
                .append("Regex = '").append(regex).append("'. "));

        while (matcher.find()) {

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder
                    .append("Match = '").append(input.substring(matcher.start(), matcher.end())).append("'. ")
                    .append("Match index range = [").append(matcher.start()).append(",").append(matcher.end()).append("). ")
                    .append("Groups = [");

            for (int gr = 0; gr <= matcher.groupCount(); gr++) {
                stringBuilder
                        .append(gr)
                        .append(" : ")
                        .append("[").append(matcher.start(gr)).append("-").append(matcher.end(gr)).append(")")
                        .append(" : ")
                        .append("'").append(matcher.group(gr)).append("'");

                if (gr != matcher.groupCount()) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");

            System.out.println(stringBuilder);
            matches++;
        }

        System.out.println(matches);
    }
}
