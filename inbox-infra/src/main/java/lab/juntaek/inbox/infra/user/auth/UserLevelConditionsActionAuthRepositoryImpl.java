package lab.juntaek.inbox.infra.user.auth;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.auth.UserLevelConditionsActionAuth;
import lab.juntaek.inbox.domain.user.auth.UserLevelConditionsActionAuthRepository;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;

public class UserLevelConditionsActionAuthRepositoryImpl implements UserLevelConditionsActionAuthRepository {

	@Override
	public List<UserLevelConditionsActionAuth> findAll() {
		return Arrays.stream(UserLevelConditionsActionAuthData.values())
				.map(e -> e.getUserLevelConditionsActionAuth())
				.collect(Collectors.toList());
	}

	@Override
	public Optional<UserLevelConditionsActionAuth> findByUserLevelConditions(UserLevelConditions userLevelConditions) {
		return Arrays.stream(UserLevelConditionsActionAuthData.values())
				.map(e -> e.getUserLevelConditionsActionAuth())
				.filter(e -> e.getUserLevelConditions().equals(userLevelConditions))
				.findAny();
	}
}
