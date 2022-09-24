package lab.juntaek.inbox.ptwas.inbox.domain.user;

import lab.juntaek.inbox.ptwas.inbox.domain.auth.UserLevel;

public class User {
	private final String name;
	private final UserLevel userLevel;
	private final UserConditions userConditions;

	public User(String name, UserLevel userLevel, UserConditions userConditions) {
		this.name = name;
		this.userLevel = userLevel;
		this.userConditions = userConditions;
	}
}
