package ccw.validator;

/**
 * Created by my on 2017. 2. 5..
 */
public interface Validator<T> {
    boolean validate(T some1, T some2);
}
