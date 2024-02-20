package shop.mtcoding.blog._core.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.mtcoding.blog._core.util.Script;

@ControllerAdvice // 응답 에러 컨트롤러다.(view 리턴) 모든 에러를 받는 어노테이션
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    public @ResponseBody String error1(Exception e){ //Throw할 때 넘어오면 처리해준다.
        return Script.back(e.getMessage());
    }
}
