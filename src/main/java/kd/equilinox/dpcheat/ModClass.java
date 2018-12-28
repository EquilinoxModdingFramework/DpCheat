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
		((Session) event.getSession()).getStats().increaseDp(1234567890);
		((Session) event.getSession()).getStats().setDpPerMinute(123000);
	}
}
