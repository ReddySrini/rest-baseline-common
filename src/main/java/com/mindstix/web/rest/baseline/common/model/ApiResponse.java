package com.mindstix.web.rest.baseline.common.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * <code>ApiResponse</code> is a model class which can be used as base response
 * for all the APIs.<br>
 * 
 * When a artifact enables the auto feature using this library then all the
 * controller methods who are wrapping their final output in ApiResponse<T> will
 * get some additional feature. As part of it, library will automatically set
 * common attributes like traceId, timestamp, path and status in
 * all ApiResponse object by intercepting response.
 * 
 * @param <T> Parameter T can be used to specify any type of data. It can be a
 *            simple object, a collection of object or a Page of object etc.
 * 
 * @author Mindstix-ychawda, susmitb
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private String traceId;

    private Long timestamp;

    private String path;

    private Integer status;

    private String error;

    private String message;

    private List<Error> errors;

    private T data;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse [traceId=" + traceId + ", timestamp=" + timestamp + ", path=" + path + ", status=" + status + ", error=" + error + ", message="
                + message + ", errors=" + errors + ", data=" + data + "]";
    }
}
