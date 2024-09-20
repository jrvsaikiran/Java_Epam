package M4_java8.Task2;

import lombok.Data;

@Data
public class Response {
    String responseBody;
    String responseType;
    Integer statusCode;

    public Response(String responseBody, Integer statusCode, String responseType) {
        this.responseBody = responseBody;
        this.responseType = responseType;
        this.statusCode = statusCode;


    }
}
