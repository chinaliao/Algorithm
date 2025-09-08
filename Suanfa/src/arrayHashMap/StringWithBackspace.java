package arrayHashMap;

import org.junit.Test;

/**
 * ClassName:StrigWithBackspace
 * Description:
 */
public class StringWithBackspace {
   @Test
   public void test(){
       String s = "abc#";
       String t = "abcd##";
       boolean equals = equals(s, t);
       System.out.println("equals = " + equals);
   }

    public static boolean equals(String s,String t) {
        return build(s).equals(build(t));
    }

    public static String build(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            if(charAt!='#'){
                stringBuilder.append(charAt);
            } else if (stringBuilder.length()>0) {
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
        return stringBuilder.toString();
    }
}
