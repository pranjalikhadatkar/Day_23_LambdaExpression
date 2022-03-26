import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String pattern,String firstName,String mood) throws InvalidUserException {
        try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, firstName))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException("Please enter proper message");
        }
    }

    public boolean lastName(String pattern,String lastName,String mood) throws InvalidUserException {
        try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, lastName))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException("Please enter proper message");
        }
    }
}
