package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        double sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum/users.size();
    }

    public static Integer getMinAge(List<User> users) {
//        int minAge = Integer.MAX_VALUE;
//        for (User user : users) {
//            if (user.getAge() < minAge) {
//                minAge = user.getAge();
//            }
//        }
//        return minAge;
        return Collections.min(users, new AgeComparator()).getAge();
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (user.getName().equals(name)) return user;
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        users.sort(new AgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        return Collections.max(users, new AgeComparator());
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }
}
