package com.mygdx.game_1_8_04;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {

	@Override
	public void create() {
		showDifficultyScreen();
	}


	public void showDifficultyScreen() {
		// TODO: Show the difficulty screen
		setScreen(new DifficultyScreen(this));
	}

	public void showIciclesScreen(Constants.Difficulty difficulty) {
		// TODO: Show the Icicles screen with the appropriate difficulty
		setScreen(new IciclesScreen(this, difficulty));
	}
}
