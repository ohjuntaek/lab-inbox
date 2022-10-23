package lab.juntaek.inbox.infra.user.userlevelcondition;

import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserLevelConditionsData {
	// 조합으로 잘~
	A(new UserLevelConditions(1L, UserLevelData.A.getUserLevel(), UserConditionsData.A.getUserConditions())),
	B(new UserLevelConditions(2L, UserLevelData.B.getUserLevel(), UserConditionsData.B.getUserConditions())),
	C(new UserLevelConditions(3L, UserLevelData.C.getUserLevel(), UserConditionsData.C.getUserConditions()))
	;

	private final UserLevelConditions userLevelConditions;
}
