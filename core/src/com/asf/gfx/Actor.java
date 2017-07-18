package com.asf.gfx;

import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Actor {

    public int ID;
    private ModelInstance instance;
    private Vector3 pos;

    public Actor(Vector3 pos, Model model){

        pos = pos;
        instance = new ModelInstance(model);
        instance.transform.setToTranslation(pos);

    }

    public void setToPos(Vector3 v){
        instance.transform.setToTranslation(pos);
    }
    public void push(Vector3 v){
        instance.transform.translate(v);
    }

    public ModelInstance getInstance() {
        return instance;
    }

    public Vector3 getPos() {
        return pos;
    }
}
