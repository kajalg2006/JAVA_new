public class convertA_to_a {
    public static void main(String[] args) {
        
        String[] str = {"A","B","C"};
        for(int i = 0 ; i<str.length;i++){
            String str1 = "";
            for(int j =0; j<str[i].length();j++){
                char ch = str[i].charAt(j);
                if(ch >= 'A' && ch<= 'Z' ){
                    ch = (char)(ch+32);
                }

                str1 +=ch;
            }
            str[i] =str1;
        }
        for(String s: str){
            System.out.println(s);
        }
    }
}
