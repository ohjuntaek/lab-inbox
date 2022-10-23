package lab.juntaek.inbox.domain.user.auth;

import java.util.List;
import lab.juntaek.inbox.domain.NaturalId;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.Entity;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.Getter;


@Getter
public class UserLevelConditionsActionAuth extends Entity {

	@NaturalId
	private final UserLevelConditions userLevelConditions;
	private final List<Action> actions;

	public UserLevelConditionsActionAuth(Long id, UserLevelConditions userLevelConditions, List<Action> actions) {
		super(id);
		this.userLevelConditions = userLevelConditions;
		this.actions = actions;
	}

	public boolean isAuthorized(Action action) {
		return actions.stream().anyMatch(e -> e.equals(action));
	}
}
