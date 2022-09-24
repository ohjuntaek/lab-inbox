package lab.juntaek.inbox.ptwas.inbox.domain.user;

import java.util.List;
import lab.juntaek.inbox.ptwas.inbox.domain.auth.UserCondition;

public class UserConditions {
	private final List<UserCondition> userConditions;

	public UserConditions(List<UserCondition> userConditions) {
		this.userConditions = userConditions;
	}
}
