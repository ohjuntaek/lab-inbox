package lab.juntaek.inbox.domain.user;

import lab.juntaek.inbox.domain.Entity;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.Getter;

@Getter
public class User extends Entity {
	private final String name;
	private final UserLevelConditions userLevelConditions;

	public User(Long id, String name, UserLevelConditions userLevelConditions) {
		super(id);
		this.name = name;
		this.userLevelConditions = userLevelConditions;
	}
}
