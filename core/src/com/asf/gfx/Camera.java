package com.asf.gfx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Camera implements Controllable{

    private com.badlogic.gdx.graphics.Camera cam;
    private CameraInputController camInput;

    public Camera(int MAPSIZE){

        //Camera
        cam = new PerspectiveCamera(60,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        cam.position.set(7f,7f,7f);
        cam.lookAt(0,0,0);
        cam.near = 1.3f;
        cam.far = 300f;
        cam.update();

        //Input
        camInput = new CameraInputController(cam);
    }
    public com.badlogic.gdx.graphics.Camera getCam() {
        return cam;
    }
    public void render(){
        cam.update();
    }

    public void setDefault(){

        cam.position.set(7f,7f,7f);
        cam.lookAt(0,0,0);
        cam.up.set(0, 1, 0);
        cam.near = 1f;
        cam.far = 300f;
        camInput.target = new Vector3(0,0,0);
    }

    public CameraInputController getInput() {
        return camInput;
    }
}
