package BAT.String;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 替换字符串中的空格 {
    public static String replaceSpace(StringBuffer str) {
        int len = str.length();
        int newlen = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                newlen = newlen + 3;
            }
            else {
                newlen ++;
            }
        }
        char []newstr = new char[newlen];
        int j = 0;
        for(int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newstr[j++] = '%';
                newstr[j++] = '2';
                newstr[j++] = '0';
            }else {
                newstr[j++] = str.charAt(i);
            }
        }

        return String.valueOf(newstr);
    }
}
