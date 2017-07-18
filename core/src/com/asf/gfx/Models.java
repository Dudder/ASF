package com.asf.gfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.ObjLoader;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Models {

    private ModelLoader loader;
    public static Model grass;
    public static Model dirt;
    public static Model water;
    public static Model giraffe;

    public Models(){

        loader = new ObjLoader();
        grass = loader.loadModel(Gdx.files.internal("gfx/grass.obj"));
        dirt = loader.loadModel(Gdx.files.internal("gfx/dirt.obj"));
        water = loader.loadModel(Gdx.files.internal("gfx/water.obj"));
        giraffe = loader.loadModel(Gdx.files.internal("gfx/giraffe.obj"));
    }
}
