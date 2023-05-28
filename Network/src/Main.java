import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Main {
    public static void URLDemo() throws MalformedURLException {
        URL hp = new URL("http://HerbSchildt.com/WhatsNew");

        System.out.println(hp.getProtocol());
        System.out.println(hp.getPort());
        System.out.println(hp.getHost());
        System.out.println(hp.getFile());
        System.out.println(hp.toExternalForm());
    }

    public static void HTTPDemo() throws Exception {
        HttpClient myHC = HttpClient.newHttpClient();
        HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com/")).build();
        HttpResponse<InputStream> myResp = myHC.send(myReq, HttpResponse.BodyHandlers.ofInputStream());

        System.out.println("Code answer: " + myResp.statusCode());
        System.out.println("Method request: " + myReq.method());

        HttpHeaders headers = myResp.headers();

        Map<String, List<String>> hdrMap = headers.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHeader: ");

        for(String k : hdrField)
            System.out.println(" Key: " + k + " Value: " + hdrMap.get(k));

        System.out.println("\nBody: ");
        InputStream input = myResp.body();
        int c;

        while((c = input.read()) != 1)
            System.out.print((char)c);
    }

    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("whois.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = (args.length == 0 ? "MHProfessional.com" : args[0]);
        byte[] buf = str.getBytes();
        out.write(buf);

        while ((c = in.read()) != -1)
            System.out.print((char)c);
        s.close();
    }
}