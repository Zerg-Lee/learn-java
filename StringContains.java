public class StringContains {
    public static boolean contains(String haystack, String needle) {
        int check=0;
        for (int i = 0; i <= haystack.length(); i++)
        {
                if (haystack.indent(i).equals(needle.indent(i+check)))
                {
                    check++;
                    if(check==needle.length()){
                        return true;
                    }
                }
                else {
                    check=0;
                }
        }
    return false;
    }
}
