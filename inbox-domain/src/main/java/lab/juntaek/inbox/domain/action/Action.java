package lab.juntaek.inbox.domain.action;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Action {
	private final String id;
}
