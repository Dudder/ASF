package com.asf.gfx;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Map {

    public final float particleSize = 0.1f;
    public final int size;

    private HashMap<Vector3,Actor> map;
    private Array<Actor> actors;

    private Array visible;

    public Map(int size){

        this.size = size;
        map = new HashMap<Vector3, Actor>();
        actors = new Array<Actor>();
        visible=new Array();
    }

    public void addToMap(Actor a){

        map.put(a.getPos(),a);
        actors.add(a);
    }

    public Actor getAtPos(Vector3 v){

        return map.get(v);
    }

    public void setAtPos(Vector3 v,Actor a){

        map.remove(v);
        actors.removeValue(map.get(v),true);
        actors.add(a);
        map.put(v,a);
    }
    public Array<ModelInstance> getMap(){

        visible.clear();
        for(Actor a:actors){
            visible.add(a.getInstance());
        }
        return visible;
    }
}
