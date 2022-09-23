package com.sim.app.restapi;

import java.util.List;

public class ListResult<T> extends CommonResult{
    private List<T> data;

    public List<T> getList() {
        return data;
    }

    public void setList(List<T> data) {
        this.data = data;
    }
}
