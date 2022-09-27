package com.sim.app.restapi.exceptiontest;

import com.sim.app.restapi.ListResult;
import com.sim.app.restapi.ResponseService;
import com.sim.app.restapi.SingleResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = {"97. Exception SetUp"})
@RestController
@RequestMapping("/exception")
public class ExController {

    @Autowired
    private ResponseService responseService;
    
    // 에러 처리 포함, 단일건 리턴
    
    @GetMapping("/ex01/{id}")
    @ExceptionHandler(UserNotFoundException.class)
    public SingleResult<EXuser> ex01(@PathVariable String id){

        System.out.println("입력된 아이디는 : " + id);

        if(id.equals("1")){
            throw new UserNotFoundException("유저를 찾지 못했습니다. 에러 입니다.");

            // 아래는 자바8 부터 throw new 대신 orElseThrow 를 쓰는 방법...
            // Optional<String> opt = Optional.of("에러");
            // return opt.orElseThrow(() -> new UserNotFoundException("유저를 찾지 못했습니다"));
        }else{
            EXuser euser = new EXuser("2","심성보");
            return responseService.getSingleResult(euser);
        }
    }

    // 특정 테이블의 리스트 리턴
    @GetMapping("/ex02/list")
    public ListResult<EXuser> getExUserList(){

        List<EXuser> exUserList = new ArrayList<>();
        //if(exUserList.size() == 0 ){  throw new UserNotFoundException("유저리스트 객체가 없습니다"); }

        for(int i = 0 ; i < 5  ; i++){
            EXuser EXuser = new EXuser(Integer.toString(i),i+"번유저");
            exUserList.add(EXuser);
        }

        return responseService.getListResult(exUserList);
    }

}
