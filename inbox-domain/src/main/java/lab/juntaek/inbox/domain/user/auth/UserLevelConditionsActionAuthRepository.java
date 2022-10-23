package lab.juntaek.inbox.domain.user.auth;

import java.util.List;
import java.util.Optional;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;

public interface UserLevelConditionsActionAuthRepository {
	List<UserLevelConditionsActionAuth> findAll();

	Optional<UserLevelConditionsActionAuth> findByUserLevelConditions(UserLevelConditions userLevelConditions);

}
