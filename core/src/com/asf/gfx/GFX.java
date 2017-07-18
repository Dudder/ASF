package com.asf.gfx;

import com.asf.sys.Command;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

public class GFX extends ApplicationAdapter {

	final int MAPSIZE = 8;

	ModelBatch modelBatch;
	SpriteBatch batch;
	Builder builder;
	Map map;
	Input input;
	
	@Override
	public void create () {

		//Drawing utilities
		modelBatch = new ModelBatch();
		batch = new SpriteBatch();
		builder = new Builder(MAPSIZE);
		map = new Map(MAPSIZE);
		input = new Input(builder.getCamera());

		//Input
		Gdx.input.setInputProcessor(input.getInput());

		//System
		new Command(map);

	}

	@Override
	public void render () {

		///updating viewport
		Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

		//Rendering sprites
		batch.begin();
		batch.draw(builder.getBackground(), 0, 0,1800,1200);
		batch.end();

		//Rendering models

		modelBatch.begin(builder.getCamera().getCam());
		modelBatch.render(map.getMap() , builder.getEnvironment());
		modelBatch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		modelBatch.dispose();
	}
}
