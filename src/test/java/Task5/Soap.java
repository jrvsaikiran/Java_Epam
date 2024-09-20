package Task5;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Soap {

    private static final String SERVICE_URL = "http://www.dneonline.com/calculator.asmx";
    private static final String SOAP_ACTION_PREFIX = "http://tempuri.org/";

    public static void main(String[] args) {
        testAdd(5, 3);
        testSubtract(10, 5);
        testMultiply(4, 6);
        testDivide(20, 4);
    }

    private static void testAdd(int a, int b) {
        String soapRequest = generateSoapRequest("Add", a, b);
        sendSoapRequest(soapRequest, "Add");
    }

    private static void testSubtract(int a, int b) {
        String soapRequest = generateSoapRequest("Subtract", a, b);
        sendSoapRequest(soapRequest, "Subtract");
    }

    private static void testMultiply(int a, int b) {
        String soapRequest = generateSoapRequest("Multiply", a, b);
        sendSoapRequest(soapRequest, "Multiply");
    }

    private static void testDivide(int a, int b) {
        String soapRequest = generateSoapRequest("Divide", a, b);
        sendSoapRequest(soapRequest, "Divide");
    }

    private static String generateSoapRequest(String methodName, int a, int b) {
        return String.format(
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n"
                        + "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <tem:%s>\n"
                        + "         <tem:intA>%d</tem:intA>\n" + "         <tem:intB>%d</tem:intB>\n"
                        + "      </tem:%s>\n" + "   </soapenv:Body>\n" + "</soapenv:Envelope>",
                methodName, a, b, methodName);
    }

    private static void sendSoapRequest(String soapRequest, String methodName) {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(SERVICE_URL);
        httpPost.setHeader("Content-Type", "text/xml; charset=utf-8");
        httpPost.setHeader("SOAPAction", SOAP_ACTION_PREFIX + methodName);

        try {
            httpPost.setEntity(new StringEntity(soapRequest));
            HttpResponse response = httpClient.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Response Status Code for " + methodName + ": " + statusCode);

            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String responseString = EntityUtils.toString(entity);
                System.out.println("Response for " + methodName + ": " + responseString);
                // Parse and handle the response as needed
            } else {
                System.out.println("No response received for " + methodName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
