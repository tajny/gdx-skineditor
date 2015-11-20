/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.shadebob.skineditor.desktop;

import java.io.File;

import javax.swing.LookAndFeel;
import javax.swing.UIManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.shadebob.skineditor.SkinEditorGame;

/**
 * Desktop launcher class
 * 
 * @author Yanick Bourbeau
 *
 */
public class DesktopLauncher {

	/**
	 * Entry point
	 */
	public static void main (String[] arg) {
		
		// Set look and feel for Swing dialogs
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1024;
		config.height = 768;
		config.resizable = true;
		config.title = "Skin Editor for libGDX (v0.3.1)";
		config.backgroundFPS = 1;
		config.vSyncEnabled = true;
		
		new LwjglApplication(new SkinEditorGame(arg), config);
	}
}
