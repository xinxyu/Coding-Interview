class ArraysAndStrings {
    public static void main(String[] args) {
        ArraysAndStrings aas = new ArraysAndStrings();
        aas.testAllUniqueCharacters();
        aas.testReverseString();
        aas.testIsPermutation();
    }

    // 1.1
    public boolean allUniqueCharacters(String inputString) {
        boolean[] hasCharacter = new boolean[256];
        for (int i = 0; i < inputString.length(); i++) {
            int charAsInt = (int) inputString.charAt(i);
            if (hasCharacter[charAsInt]) {
                return false;
            } else {
                hasCharacter[charAsInt] = true;
            }
        }
        return true;
    }

    public void testAllUniqueCharacters() {
        System.out.println("1.1 Tests");
        System.out.println();
        String[] tests = new String[] { "Hello", "Hh", "11", "3", "asdf", ",./?" };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("'" + tests[i] + "' :" + this.allUniqueCharacters(tests[i]));
        }
        System.out.println();
    }

    // 1.2
    public char[] reverseString(char[] inputString) {
        if (inputString.length == 0 || inputString.length == 1) {
            return inputString;
        } else {
            char holder = inputString[0];
            for (int i = 0; i < inputString.length / 2; i++) {
                int newIndex = (inputString.length - 1) - i;
                holder = inputString[i];
                inputString[i] = inputString[newIndex];
                inputString[newIndex] = holder;
            }
            return inputString;
        }
    }

    public void printCharArray(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
    }

    public void testReverseString() {
        System.out.println("1.2 Tests");
        System.out.println();
        char[][] tests = new char[][] { { 'H' }, { 'N', 'O' }, { '1', '2', '3' }, { 'a', 'b', 'c', 'd', 'e', 'f' } };
        for (int i = 0; i < tests.length; i++) {
            this.printCharArray(tests[i]);
            System.out.print(" : ");
            this.printCharArray(this.reverseString(tests[i]));
            System.out.println();
        }
        System.out.println();
    }

    // 1.3
    public boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            int[] charHistogram = new int[256];
            for (int i = 0; i < a.length(); i++) {
                int charAsInt = (int) a.charAt(i);
                charHistogram[charAsInt]++;
            }
            for (int i = 0; i < b.length(); i++) {
                int charAsInt = (int) b.charAt(i);
                charHistogram[charAsInt]--;
                if (charHistogram[charAsInt] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void testIsPermutation() {
        System.out.println("1.3 Tests");
        System.out.println();
        String[] tests1 = new String[] { "Hello", "aaa", "a", "34143", "b" };
        String[] tests2 = new String[] { "olleH", "aab", "b", "34243", "b" };

        for (int i = 0; i < tests1.length; i++) {
            System.out.println("string 1:" + tests1[i]);
            System.out.println("string 2:" + tests2[i]);
            System.out.println("result: " + this.isPermutation(tests1[i], tests2[i]));
        }
        System.out.println();
    }

    // 1.4
    // TODO
    public char[] replaceSpaces(char[] inputString){
        return inputString;
    }
}