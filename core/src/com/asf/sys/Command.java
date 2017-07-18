package com.asf.sys;

import com.asf.gfx.Actor;
import com.asf.gfx.Map;
import com.asf.gfx.Models;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

import java.util.HashMap;


/**
 * Created by Lenovo on 17/07/2017.
 */
public class Command {

    Array<Actor> actors;
    Map map;

    public Command(Map map) {

        actors = new Array<Actor>();
        this.map = map;
        //place cmds here

        createLayer(0, 0.2, Models.water, Models.dirt);
        addToLayer(0,0.34,Models.grass);
        addToLayer(map.particleSize,0.05,Models.dirt);

    }

    public void createLayer(float height, double prob, Model appearance, Model def) {

        for (float i = -map.size / 2; i < map.size / 2; i += map.particleSize) {
            for (float j = -map.size / 2; j < map.size / 2; j += map.particleSize) {
                if (Math.random() <= prob) {
                    map.addToMap(new Actor(new Vector3(i, height, j), appearance));
                } else if (def != null) {
                    map.addToMap(new Actor(new Vector3(i, height, j), def));
                }
            }
        }
    }

    public void addToLayer(float height, double prob, Model appearance) {

        for (float i = -map.size / 2; i < map.size / 2; i += map.particleSize) {
            for (float j = -map.size / 2; j < map.size / 2; j += map.particleSize) {
                if (Math.random() <= prob) {
                    Vector3 v = new Vector3(i, height, j);
                    map.setAtPos(v,new Actor(v, appearance));
                }
            }
        }
    }
}