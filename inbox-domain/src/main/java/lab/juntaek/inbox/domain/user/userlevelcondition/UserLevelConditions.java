package lab.juntaek.inbox.domain.user.userlevelcondition;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserLevelConditions {

	private final String id;
	private final UserLevel userLevel;
	private final UserConditions userConditions;
}
