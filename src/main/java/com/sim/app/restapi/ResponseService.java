package com.sim.app.restapi;

import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    //단일결과 처리 메서드
    public <T> SingleResult<T> getSingleResult(T data){
        SingleResult<T> result =new SingleResult<>();
        result.setData(data);
        setSuccessResult(result);
        return result;
    }

    // API 요청 성공 시 응답 모델을 성공 데이터로 셋팅
    private void setSuccessResult(CommonResult result){
        result.setSuccess(true);
        result.setCode(CommonResponse.SUCCESS.getCode());
        result.setMsg(CommonResponse.SUCCESS.getMsg());
    }
}
