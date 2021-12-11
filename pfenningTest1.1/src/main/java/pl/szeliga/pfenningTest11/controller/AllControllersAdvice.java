package pl.szeliga.pfenningTest11.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_ACCEPTABLE;

@ControllerAdvice
public class AllControllersAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = { Exception.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "Cos poszlo niehalo kolego";
        // NOT_ACCEPTABLE wybralem tu zupelnie z sufitu dla przykladu
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), NOT_ACCEPTABLE, request);
    }
}
