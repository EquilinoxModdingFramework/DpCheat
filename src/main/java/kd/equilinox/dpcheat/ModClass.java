package kd.equilinox.dpcheat;

import kd.equilinox.events.sessions.PostLoadSessionEvent;
import kd.equilinox.mods.IMod;
import session.Session;

/**
 * Mod which hacks players DP.
 * 
 * @author Krzysztof Dobrzynski - k.dobrzynski94@gmail.com
 */
public class ModClass implements IMod {
	public String getModName() {
		return "DP Cheat";
	}

	public void postLoadSession(PostLoadSessionEvent event) {
		int dp = 999999999;

		if (((Session) event.getSession()).getStats().getDpCount() < dp) {
			((Session) event.getSession()).getStats().increaseDp(dp);
			((Session) event.getSession()).getStats().setDpPerMinute(999999);
		}
	}
}
