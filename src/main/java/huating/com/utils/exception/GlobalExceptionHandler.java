package huating.com.utils.exception;

import huating.com.utils.message.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(
        annotations = {RestController.class}
)
public class GlobalExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    ResponseBaseDto handleException(Exception e){
        ResponseBaseDto response = new ResponseBaseDto();
        response.setMessage("操作失败");
        response.setSuccess(CommonConstant.FAIL);
        logger.info(e.getMessage());
        logger.debug(e.getMessage()+"/n");
        return response;
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    ResponseBaseDto handleBusinessException(BusinessException e){
        ResponseBaseDto response = new ResponseBaseDto();
        response.setSuccess(CommonConstant.FAIL);
        response.setMessage(e.getMessage());
        logger.info(e.getMessage());
        logger.debug(e.getMessage());
        return response;
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResponseBaseDto nullPointerExceptionHandler(NullPointerException e) {
        ResponseBaseDto response = new ResponseBaseDto();
        response.setSuccess(CommonConstant.FAIL);
        response.setMessage("操作失败");
        logger.info(e.getMessage());
        logger.debug(e.getMessage());
        return response;
    }
}
