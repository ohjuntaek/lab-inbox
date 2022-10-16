package lab.juntaek.inbox.domain.user.userlevelcondition;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserCondition {
	private final String id;
	private final String name;
}
