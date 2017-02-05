package ccw.validator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by my on 2017. 2. 5..
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringValidatorTest {

    @Autowired
    Validator validator;

    private String getRandomAlphabetString(int length) {
        String str = "";

        Random rand = new Random();

        for(int i = 0 ; i < length ; i++) {
            char c = (char)(rand.nextInt(26) + 'a');
            str += c;
        }

        return str;
    }

    private String getFileString(String filePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());

        System.out.printf(file.getAbsolutePath());
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            return everything;
        }
    }

    @Test
    public void validateSimpleStrings() throws Exception {
        assertTrue(validator.validate("abc", "abc"));
    }

    @Test
    public void validateLongStrings() throws Exception {
        String origin = this.getRandomAlphabetString(100);

        String first = new String(origin), second = new String(origin);

        assertTrue(validator.validate(first, second));
    }

    @Test
    public void validateFiles() throws Exception {
        String first = getFileString("answer0.in");
        String second = getFileString("d0.in");

        assertTrue(validator.validate(first, second));
    }
}