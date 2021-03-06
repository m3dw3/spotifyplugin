package hu.rozsenich.ideaplugin.spotifyplugin;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.sun.jna.platform.win32.WinDef;

/**
 * Created by rozsenichb on 10/02/2016.
 */
public class Next extends AbstractSpotifyCommandAction {

	@Override
	WinDef.LPARAM command() {
		return COMMANDS.CMD_NEXT;
	}

	@Override
	public void update(AnActionEvent e) {
		e.getPresentation().setEnabled(active);
	}
}
