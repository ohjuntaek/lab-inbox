package lab.juntaek.inbox.domain.user.auth;

import java.util.List;
import java.util.Optional;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;

public interface ActionAuthRepository {
	List<ActionAuth> findAll();

	Optional<ActionAuth> findByUserLevelConditions(UserLevelConditions userLevelConditions);

	List<ActionAuth> findByAction(Action action);
}
