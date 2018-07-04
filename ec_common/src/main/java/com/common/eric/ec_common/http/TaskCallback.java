package com.common.eric.ec_common.http;

/**
 * Created by Eric
 */

public interface TaskCallback {

    void taskStart(Object tag);

    void taskFinish(Object tag, ResultModel result);
}
