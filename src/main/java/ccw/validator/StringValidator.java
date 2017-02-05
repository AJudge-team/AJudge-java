package ccw.validator;

import org.springframework.stereotype.Service;

/**
 * Created by my on 2017. 2. 5..
 */

@Service
public class StringValidator implements Validator<String> {
    @Override
    public boolean validate(String some1, String some2) {
        return some1.equals(some2);
    }
}
