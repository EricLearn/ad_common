package com.common.eric.ec_common.http;

/**
 * Created by Eric
 */

public interface HttpTypeHelper {

    public interface  HttpMethod {
        public static final int HttpMethod_Get = 1;  // Get
        public static final int HttpMethod_Post = 2; // Post
        public static final int HttpMethod_Delete = 3; // Delete
    }

    public interface ErrorCode {
        public static int HttpParseError_Code = 1001;
    }

    public interface ErrorMessage {
        public static String HttpParseError_Message = "数据解析出错";
    }

    /**
     * 服务器返回数据类型， 可由访问处显示指定，也可以判断返回数据结构。
     */
    public enum BodyDataType {
        UNKNOWN,
        STRING,         //String
        JSON_OBJECT,    //json对象
        JSON_ARRAY,     //json数组
        XML,            //XML
        SHOP,           //shop
    }
}
