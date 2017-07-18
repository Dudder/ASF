package com.asf.gfx;

import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by Lenovo on 16/07/2017.
 */
public class Input<E> {

    private InputMultiplexer input;

    private InputProcessor camInput;

    public Input(Controllable control){

        input = new InputMultiplexer();
        camInput = (InputProcessor) control.getInput();
        input.addProcessor(camInput);

    }
    public InputMultiplexer getInput(){
        return input;
    }
}
