import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.List;

public class SocialNetworkTest extends BaseSocialNetworkTest {
    @Override
    protected SocialNetwork getSocialNetwork() {
        return new SocialNetworkImpl();
    }


}
