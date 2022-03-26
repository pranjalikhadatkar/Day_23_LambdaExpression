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

        Check phone = (String pattern, String iPhone, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, iPhone))
                    return true;
                else
                    return false;
            } else
                return false;
        }catch (NullPointerException e) {
            throw new InvalidUserException("Please enter proper message");
        }};

        Check password = (String pattern, String iPassword, String mood) -> {try {
            if (mood.equals("Happy")) {
                if (Pattern.matches(pattern, iPassword))
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
        System.out.println(phone.check("^[0-9]{2}[ ]?[0-9]{10}$","918412087844","Happy"));
        System.out.println( password.check("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","Pranju@12","Happy"));
    }
}
