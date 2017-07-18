package com.asf.gfx;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Builder {

    private int MAPSIZE;
    private Texture background;
    private Camera camera;
    private Environment environment;

    public Builder(int MAPSIZE){

        this.MAPSIZE=MAPSIZE;
        createBackground();
        createCamera();
        createEnviroment();
        createModels();

    }

    private void createBackground(){

        background = new Texture("gfx//background_1.jpg");
    }

    private void createCamera(){
        camera = new Camera(MAPSIZE);
    }

    private void createEnviroment(){

        environment = new Environment();
        environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1f));
        environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, -0.2f));
    }

    private void createModels(){
        new Models();
    }

    public Texture getBackground() {
        return background;
    }

    public Camera getCamera() {
        return camera;
    }

    public Environment getEnvironment() {
        return environment;
    }
}
