package test;

public class DuplicateWord {
    public static String remove(String string) {
        string = string.toLowerCase();
        String word[] = string.split(" ");
        String rs = "";
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    word[j] = "REPEAT";
                    word[i] = "";
                }
            }
            rs = rs + word[i]+" ";
        }
        return rs;
    }
    public static void main(String[] args) 
    { 
       testcase t = new testcase(); 
       t.test();
        }
    }