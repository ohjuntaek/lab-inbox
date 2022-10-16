package lab.juntaek.inbox.domain.user.userlevelcondition;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserConditions {
	private final String id;
	private final List<UserCondition> userConditions;
}
