package su.elwood;

import java.io.InputStream;

/**
 * User: igor.kostromin
 * Date: 13.02.13
 * Time: 16:32
 */
public class Program {

    public static void main(String[] args) {

        InputStream stream = ClassLoader.getSystemResourceAsStream("input.txt");
        Parser parser = new Parser( stream );
        try {
            parser.parse();
        } catch ( ParseException e ) {
            e.printStackTrace();
        }

    }
}
