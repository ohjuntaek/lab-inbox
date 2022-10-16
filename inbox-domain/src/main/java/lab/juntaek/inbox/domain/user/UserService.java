package lab.juntaek.inbox.domain.user;

import java.util.List;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.action.ActionRepository;
import lab.juntaek.inbox.domain.user.auth.ActionAuth;
import lab.juntaek.inbox.domain.user.auth.ActionAuthRepository;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditionsRepository;

public class UserService {
	private final UserLevelConditionsRepository userLevelConditionsRepository;
	private final ActionRepository actionRepository;
	private final ActionAuthRepository actionAuthRepository;

	public UserService(
			UserLevelConditionsRepository userLevelConditionsRepository,
			ActionRepository actionRepository,
			ActionAuthRepository actionAuthRepository
	) {
		this.userLevelConditionsRepository = userLevelConditionsRepository;
		this.actionRepository = actionRepository;
		this.actionAuthRepository = actionAuthRepository;
	}

	public void authorize(UserLevelConditions userLevelConditions, Action action) {
		final ActionAuth findAuth = actionAuthRepository.findByUserLevelConditions(userLevelConditions)
				.orElseThrow();

		findAuth.getActions();
	}
}
