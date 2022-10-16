package lab.juntaek.inbox.infra.user.auth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.auth.ActionAuth;
import lab.juntaek.inbox.domain.user.auth.ActionAuthRepository;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;

public class ActionAuthRepositoryImpl implements ActionAuthRepository {

	@Override
	public List<ActionAuth> findAll() {
		return Arrays.stream(ActionAuthData.values())
				.map(e -> e.getActionAuth())
				.collect(Collectors.toList());
	}

	@Override
	public Optional<ActionAuth> findByUserLevelConditions(UserLevelConditions userLevelConditions) {
		return Arrays.stream(ActionAuthData.values())
				.map(e -> e.getActionAuth())
				.filter(e -> e.getUserLevelConditions().equals(userLevelConditions))
				.findAny();
	}

	@Override
	public List<ActionAuth> findByAction(Action action) {
		return null;
	}
}
