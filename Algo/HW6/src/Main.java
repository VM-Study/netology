public class Main {
    public static void main(String[] args) {
        System.out.println(search("Alibaba or Alibubab? I do not know!", "b*b"));
    }

    public static String search(String source, String pattern) {
        if (source.length() < pattern.length()) {
            return "Такой подстроки точно нет!";
        }
        String found = "";
        long patternHash = code(pattern, 0, 0) - code("*", 0, 0);
        int asterikPosition = pattern.indexOf('*');
        long windowHash = 0;
        for (int start = 0; start < source.length() - pattern.length() + 1; start++) {
            if (start == 0) {
                windowHash = code(source, 0, pattern.length());
                windowHash -= code(source, asterikPosition, 1);
            } else {
                windowHash -= code(source, start -1 , 1);
                windowHash += code(source, start + pattern.length() - 1, 1);
                windowHash -= code(source, start+asterikPosition, 1);
            }
            if (windowHash == patternHash) {
                for (int i = 0; i < pattern.length(); i++) {
                    if (pattern.charAt(i) != '*' && source.charAt(start + i) != pattern.charAt(i)) {

                    } else {
//                        found += source.substring(start, start + pattern.length()) + ", ";
                        found += source.charAt(start + i);
                    }
                }
                found += ", ";
            }
            windowHash += code(source, start + asterikPosition, 1);
        }
        return found;
    }

    private static long code(String text, int start, int stop) {
        if (stop == 0) {
            stop = text.length();
        } else {
            stop += start;
        }
        char[] chars = text.toCharArray();
        int sum = 0;
        for (; start < stop; start++) {
            sum += chars[start];
        }
        return sum;
    }
}