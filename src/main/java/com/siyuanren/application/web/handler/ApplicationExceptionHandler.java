package com.siyuanren.application.web.handler;

import com.siyuanren.application.core.exception.BaseException;
import com.siyuanren.application.core.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

    /**
     * 自定义异常
     */
    @ExceptionHandler(BaseException.class)
    public Result handleBaseException(BaseException e) {
        Result result = new Result();
        logger.info(e.getMessage());
        return result;
    }
}
