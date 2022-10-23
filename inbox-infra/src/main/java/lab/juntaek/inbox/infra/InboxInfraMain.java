package lab.juntaek.inbox.infra;

import lab.juntaek.inbox.domain.user.User;
import lab.juntaek.inbox.domain.user.UserService;
import lab.juntaek.inbox.domain.user.userlevelcondition.UserLevelConditions;
import lab.juntaek.inbox.infra.action.ActionData;
import lab.juntaek.inbox.infra.user.auth.UserLevelConditionsActionAuthRepositoryImpl;
import lab.juntaek.inbox.infra.user.userlevelcondition.UserLevelConditionsData;

public class InboxInfraMain {

	public static void main(String[] args) {
		UserService userService = new UserService(new UserLevelConditionsActionAuthRepositoryImpl());
		final User user = new User(1L, "헤리미", UserLevelConditionsData.C.getUserLevelConditions());

		System.out.println(userService.authorize(user, ActionData.A.getAction()));
		System.out.println(userService.authorize(user, ActionData.B.getAction()));
		System.out.println(userService.authorize(user, ActionData.C.getAction()));
	}
}
