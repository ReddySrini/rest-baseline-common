package rest.baseline.commom.util;

/**
 * 
 * <code>RestBaselineConstants</code> is constants class for ReSTBasline
 * framework.<br>
 * 
 * @author Mindstix-ychawda, susmitb
 */
public class RestBaselineConstants {

    /**
     * This constant is used for TraceId field in the request
     */
    public static final String TRACE_ID_KEY = "traceId";

    /**
     * This constant is used for name of the property used to create a
     * RestBaselineResponseBodyAdvice bean conditionally.
     */
    public static final String REST_BASELINE_FEATURE_FLAG_NAME = "rest.baseline.feature.enabled";

    /**
     * This constant is used for value expected from the property used to create
     * a RestBaselineResponseBodyAdvice bean conditionally.
     */
    public static final String REST_BASELINE_FEATURE_FLAG_ENABLED_ON_VALUE = "true";

    /**
     * This constant is used as a key for the map of error attributes sent in
     * case of error response.
     */
    public static final String ERROR_RESPONSE_EXCEPTION_KEY = "exception";

    /**
     * This constant is used as value of the error code for all the unhandled
     * exceptions.
     */
    public static final String DEFAULT_ERROR_CODE_FOR_UNEXPECTED_ERROR = "SYS_ERROR";

    /**
     * This constant is used as value of the error message for all the unhandled
     * exceptions.
     */
    public static final String DEFAULT_ERROR_MESSAGE_FOR_UNEXPECTED_ERROR = "Unexpected error occurred while processing request.";
}
