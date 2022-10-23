package lab.juntaek.inbox.infra.user.userlevelcondition;

import java.util.List;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserConditions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserConditionsData { // 조합으로 잘~
	A(new UserConditions(List.of(
			UserConditionData.A.getUserCondition()
	))),
	B(new UserConditions(List.of(
			UserConditionData.B.getUserCondition()
	))),
	C(new UserConditions(List.of(
			UserConditionData.C.getUserCondition()
	)))
	;
	private final UserConditions userConditions;
}
