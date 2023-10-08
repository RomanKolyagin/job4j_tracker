package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User neededUserProfile = null;
        for (User user: users) {
            if (login.equals(user.getUsername())) {
                neededUserProfile = user;
                break;
            }
        }
        if (neededUserProfile == null) {
            throw new UserNotFoundException("User with login" + login + "is not found");
        }
        return neededUserProfile;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3) {
            throw new UserInvalidException("User: " + user + "is valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Roman Kolyagin", true),
                new User("Bogdan Kolyagin", true),
                new User("Petr Arsentev", false)
        };
        String login = "Roman Kolyagin";
        try {
            User user = findUser(users, login);
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}