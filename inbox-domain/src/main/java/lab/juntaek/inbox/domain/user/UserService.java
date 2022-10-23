package lab.juntaek.inbox.domain.user;

import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.auth.UserLevelConditionsActionAuth;
import lab.juntaek.inbox.domain.user.auth.UserLevelConditionsActionAuthRepository;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService {
	private final UserLevelConditionsActionAuthRepository userLevelConditionsActionAuthRepository;

	public boolean authorize(User user, Action action) {
		return this.authorize(user.getUserLevelConditions(), action);
	}

	public boolean authorize(UserLevelConditions userLevelConditions, Action action) {
		final UserLevelConditionsActionAuth findAuth = userLevelConditionsActionAuthRepository.findByUserLevelConditions(userLevelConditions)
				.orElseThrow();

		return findAuth.isAuthorized(action);
	}
}
