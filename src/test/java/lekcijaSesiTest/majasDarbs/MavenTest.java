package lekcijaSesiTest.majasDarbs;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class MavenTest {

    public static void main(String[] args) throws IOException {

        String asciiArt = FigletFont.convertOneLine("Ivita Vasiļevska");
        System.out.println(asciiArt);
    }
}
