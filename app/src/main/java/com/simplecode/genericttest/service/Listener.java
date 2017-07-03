package com.simplecode.genericttest.service;

import com.simplecode.genericttest.model.BaseModel;

import org.json.JSONObject;

public interface Listener<T extends BaseModel> {
    void onSuccess(JSONObject jsonObject, T response);
    void onError(Throwable throwable);
}
