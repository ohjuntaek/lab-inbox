package lab.juntaek.inbox.infra.user.userlevelcondition;

import java.util.List;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserConditions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserConditionsData {
	A(new UserConditions("A", List.of(
			UserConditionData.A.getUserCondition()
	))),
	B(new UserConditions("B", List.of(
			UserConditionData.B.getUserCondition()
	))),
	C(new UserConditions("C", List.of(
			UserConditionData.C.getUserCondition()
	)))
	// TODO 흠 콤비네이션으로 어떻게 잘 만들지??
	;
	private final UserConditions userConditions;
}
