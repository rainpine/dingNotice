package com.test.demo;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Demo2 {
    public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=487d3c0b927e9485a4a991e681763bb00f23bac80f3973471a799fbba2002795";

    public static void main(String args[]) throws Exception{

        HttpClient httpclient = HttpClients.createDefault();

        HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");
        String s1 = "我就是我";
        String s2 = "不一样的烟火";


        String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \""+s1+s2+"\"}}";
        StringEntity se = new StringEntity(textMsg, "utf-8");
        httppost.setEntity(se);

        HttpResponse response = httpclient.execute(httppost);
        if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
            String result= EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(result);
        }
    }
}
