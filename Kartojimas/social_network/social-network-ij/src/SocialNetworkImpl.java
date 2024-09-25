import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;

public class SocialNetworkImpl implements SocialNetwork {
    Collection<Friend> friends = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetworkImpl that = (SocialNetworkImpl) o;
        return Objects.equals(friends, that.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(friends);
    }

    @Override
    public void addFriend(Friend friend) throws IllegalArgumentException {
        if (friend == null) {
            throw new IllegalArgumentException();
        }
            if (friends != null && !friends.contains(friend)) {
                friends.add(friend);
            }
    }

    @Override
    public int getNumberOfFriends() {
            return friends.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException, IllegalArgumentException {
        if (s == null || s1 == null) {
            throw new IllegalArgumentException();
        }
        return friends.stream()
                .filter(f -> f.getFirstName().equals(s) && f.getLastName().equals(s1))
                .findFirst()
                .orElseThrow(() -> new FriendNotFoundException(s,s1));
    }

    @Override
    public Collection<Friend> findByCity(String s) throws IllegalArgumentException {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        return friends.stream()
                .filter(f -> f.getCity().equals(s)).toList();
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        return friends.stream()
                .sorted(Comparator.comparing(Friend::getCity)
                        .thenComparing(Friend::getLastName)
                        .thenComparing(Friend::getFirstName))
                .toList();
    }
}
