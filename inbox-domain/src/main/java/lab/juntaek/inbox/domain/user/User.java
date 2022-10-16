package lab.juntaek.inbox.domain.user;

import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;

public class User {

	private final String name;
	private final UserLevelConditions userLevelConditions;

	public User(String name, UserLevelConditions userLevelConditions) {
		this.name = name;
		this.userLevelConditions = userLevelConditions;
	}
}
