package com.simplecode.genericttest.service;

import com.simplecode.genericttest.model.BaseModel;

import org.json.JSONObject;

public abstract class Base {

    public <T extends BaseModel> void doRequest(Listener<T> listener, Parser<JSONObject, T> parser) {
        //jakieś tam requesty leco
        JSONObject response = new JSONObject();
        listener.onSuccess(response, parser.parse(response));
    }

}
