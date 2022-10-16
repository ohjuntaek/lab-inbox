package lab.juntaek.inbox.domain.user.userlevelcondition;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserLevel {
	private final String id;
	private final String name;
}
