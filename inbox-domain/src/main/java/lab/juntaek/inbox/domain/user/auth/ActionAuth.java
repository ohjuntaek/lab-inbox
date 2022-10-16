package lab.juntaek.inbox.domain.user.auth;

import java.util.List;
import lab.juntaek.inbox.domain.action.Action;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class ActionAuth {
	private final String id;
	private final UserLevelConditions userLevelConditions;
	private final List<Action> actions;
}
