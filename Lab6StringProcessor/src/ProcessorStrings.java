class ProcessStrings implements StringProcessor {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            oddChars.append(s.charAt(i));
        }
        return oddChars.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
