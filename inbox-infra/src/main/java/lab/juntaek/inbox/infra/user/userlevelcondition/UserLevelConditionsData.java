package lab.juntaek.inbox.infra.user.userlevelcondition;

import java.util.List;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserConditions;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserLevelConditionsData {
	A(new UserLevelConditions("A", UserLevelData.A.getUserLevel(), UserConditionsData.A.getUserConditions())),
	B(new UserLevelConditions("B", UserLevelData.B.getUserLevel(), UserConditionsData.B.getUserConditions())),
	C(new UserLevelConditions("C", UserLevelData.C.getUserLevel(), UserConditionsData.C.getUserConditions()))
	;

	private final UserLevelConditions userLevelConditions;
}
