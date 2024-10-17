public class SimplePalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(cleanStr).reverse().toString().equals(cleanStr);
    }
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "Madam", 
            "Hello", 
            "A man, a plan, a canal, Panama", 
            ""
        };
        for (String test : testStrings) {
            if (isPalindrome(test)) {
                System.out.println("\"" + test + "\" is a palindrome.");
            } else {
                System.out.println("\"" + test + "\" is not a palindrome.");
            }
        }
    }
}
