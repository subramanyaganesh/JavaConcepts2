package STREAMTOCKENIZER;

import java.util.Arrays;
import java.util.StringTokenizer;

public class demo1 {

    public static void main(String[] args) throws Exception {
        /*StreamTokenizer stm = new StreamTokenizer(new BufferedReader(new StringReader(" i hello i sir 3 i how i are i you|i Hope 5 i YOu i r i doing 6 i good\n" +
                "yo dude crazy")));

        while (stm.nextToken() != StreamTokenizer.TT_EOF) {
            stm.ordinaryChar('i');
            stm.lowerCaseMode(false);
            String s;
            switch (stm.ttype) {
                case StreamTokenizer.TT_NUMBER:
                    s = Double.toString(stm.nval);
                    break;
                case StreamTokenizer.TT_WORD:
                    s = stm.sval;
                    break;
                case StreamTokenizer.TT_EOL:
                    s = "eol";
                    break;
                default:
                    s = String.valueOf((char) stm.ttype);

            }

            System.out.println(s);
        }
        System.out.println(stm.lineno());
        stm.commentChar('i');*/
        StringTokenizer stringTokenizer=new StringTokenizer(" i hello i sir 3 i how i are i you|i Hope 5 i YOu i r i doing 6 i good\n" +
                "yo dude crazy");
        String[] s=new String[10];
        for (int i=0;stringTokenizer.hasMoreTokens();i++){
             s[i]= stringTokenizer.nextToken("|");
        }
        Arrays.stream(s).forEach(System.out::println);

    }
}
