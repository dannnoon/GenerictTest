package com.simplecode.genericttest.service;

abstract public class Parser<I, O> {
    public abstract O parse(I in);
}
