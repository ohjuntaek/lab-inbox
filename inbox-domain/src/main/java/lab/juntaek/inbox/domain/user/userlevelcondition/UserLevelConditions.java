package lab.juntaek.inbox.domain.user.userlevelcondition;

import lab.juntaek.inbox.domain.Entity;
import lab.juntaek.inbox.domain.NaturalId;

public class UserLevelConditions extends Entity {

	@NaturalId
	private final UserLevel userLevel;

	@NaturalId
	private final UserConditions userConditions;

	public UserLevelConditions(Long id, UserLevel userLevel, UserConditions userConditions) {
		super(id);
		this.userLevel = userLevel;
		this.userConditions = userConditions;
	}
}
