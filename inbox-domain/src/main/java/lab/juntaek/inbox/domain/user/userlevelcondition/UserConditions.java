package lab.juntaek.inbox.domain.user.userlevelcondition;

import java.util.List;
import lab.juntaek.inbox.domain.ValueObject;
import lombok.Getter;

@Getter
public class UserConditions extends ValueObject {
	private final List<UserCondition> userConditions;

	public UserConditions(List<UserCondition> userConditions) {
		this.userConditions = userConditions;
	}
}
