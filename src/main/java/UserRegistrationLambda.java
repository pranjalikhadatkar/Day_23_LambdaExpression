import java.util.regex.Pattern;

@FunctionalInterface
interface Check {
    boolean check(String a, String b, String c) throws InvalidUserException;
}

public class UserRegistrationLambda {
    public static void main(String[] args) throws InvalidUserException {
        Check firstName = (String pattern, String fname, String mood) -> {
            try {
                if (mood.equals("Happy")) {
                    if (Pattern.matches(pattern, fname))
                        return true;
                    else
                        return false;
                } else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };

        Check lastName = (String pattern, String lname, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, lname))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException("Please enter proper message");
        }};

        Check email = (String pattern, String iEmail, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, iEmail))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException("Please enter proper message");
        }};

        System.out.println(firstName.check(("^[A-Z]{1}[a-z]{3,}$"),"pranjali","Happy"));
        System.out.println( lastName.check("^[A-Z]{1}[a-z]{3,}$","Khadatkar","Happy"));
        System.out.println( email.check("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","Khadatkar@gmail.com","Happy"));
    }
}
