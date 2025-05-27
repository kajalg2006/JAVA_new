public class C {
public static char highestOccurringChar(char input[]) {
      int freq[] = new int[26];

    // First pass: Count frequencies
    for (int i = 0; input[i] != '\0'; i++) {
        freq[input[i] - 'a']++;
    }

    // Second pass
    int maxFreq = 0;
    for (int i = 0; i < 26; i++) {
        if (freq[i] > maxFreq) {
            maxFreq = freq[i];
        }
    }

    
    for (int i = 0; input[i] != '\0'; i++) {
        if (freq[input[i] - 'a'] == maxFreq) {
            return input[i];  
        }
    }

    System.out.println(maxFreq);
    return '\0';
}

    public static void main(String[] args) {
        char arr[]= {'a','b','c','d','a'} ;
        highestOccurringChar(arr);
 
    }
}
