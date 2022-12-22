package practice7.task5;

public class Strings implements StringTreatment{
    private String str;

    Strings(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public int countSymbols(char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
    @Override
    public String oddSymbols() {
        String oddStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            oddStr += str.charAt(i);
        }
        str = oddStr;
        return str;
    }
    @Override
    public void reverse() {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverseStr += str.charAt(i);
        str = reverseStr;
    }
}
