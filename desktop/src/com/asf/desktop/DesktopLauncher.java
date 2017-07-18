package com.asf.desktop;

import com.asf.gfx.GFX;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.width = 1800;
		cfg.height = 1200;
		new LwjglApplication(new GFX(),cfg);
	}
}
