package org.xwiki.android.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

import android.util.Log;

public class HttpConnector
{

    private URI requestUri;

    private String username, password;

    private boolean isSecured = false;

    // Variables for http connection
    private HttpRequestInterceptor preemptiveAuth;

    private DefaultHttpClient client;

    public void setAuthenticaion(String username, String password)
    {
        this.username = username;
        this.password = password;
        isSecured = true;
    }

    public boolean getIsSecured()
    {
        return isSecured;
    }

    public String getResponse(String Uri)
    {
        initialize();

        BufferedReader in = null;
        HttpGet request = new HttpGet();
        String responseText = new String();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);
        try {

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());

            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null) {
                sb.append(line + NL);
            }
            in.close();
            responseText = sb.toString();
            Log.d("Response", "response: " + responseText);

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return responseText;
    }

    public String deleteRequest(String Uri)
    {
        initialize();

        HttpDelete request = new HttpDelete();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);

        try {

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());
            return response.getStatusLine().toString();

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "error";
    }

    public int checkLogin(String username, String password, String Url)
    {

        initialize();

        HttpGet request = new HttpGet();
        HttpResponse response;
        String Uri;
        int responseCode = 0;

        Uri = "http://" + Url + "/xwiki/rest/";

        try {
            requestUri = new URI(Uri);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);
        try {

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());

            String[] responseParts = response.getStatusLine().toString().split(" ");
            responseCode = Integer.parseInt(responseParts[1]);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.d("response code", String.valueOf(responseCode));
        return responseCode;
    }

    // Post request
    public String postRequest(String Uri, String content)
    {
        initialize();

        HttpPost request = new HttpPost();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);

        try {
            Log.d("Post content", "content=" + content);
            StringEntity se = new StringEntity(content, "UTF-8");

            se.setContentType("application/xml");
            // se.setContentType("text/plain");
            request.setEntity(se);
            request.setHeader("Content-Type", "application/xml;charset=UTF-8");

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());
            return response.getStatusLine().toString();

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "error";
    }

    // Put request
    public String putRequest(String Uri, String content)
    {
        HttpPut request = new HttpPut();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);

        try {
            Log.d("Put content", "content=" + content);
            StringEntity se = new StringEntity(content, "UTF-8");

            se.setContentType("application/xml");
            // se.setContentType("text/plain");
            request.setEntity(se);
            request.setHeader("Content-Type", "application/xml;charset=UTF-8");

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());
            return response.getStatusLine().toString();

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "error";
    }

    public InputStream getResponseAttachment(String Uri)
    {
        initialize();

        BufferedReader in = null;
        HttpGet request = new HttpGet();
        String responseText = new String();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);
        try {

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());

            // in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            return response.getEntity().getContent();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public String putRaw(String Uri, String filePath)
    {

        HttpPut request = new HttpPut();
        HttpResponse response;

        try {
            requestUri = new URI(Uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        setCredentials();

        request.setURI(requestUri);
        Log.d("Request URL", Uri);

        try {

            File file = new File(filePath);
            FileEntity fe = new FileEntity(file, "/");

            request.setEntity(fe);
            // request.setHeader("Content-Type","application/xml;charset=UTF-8");

            response = client.execute(request);
            Log.d("Response status", response.getStatusLine().toString());
            return response.getStatusLine().toString();

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "error";
    }

    private void initialize()
    {
        client = new DefaultHttpClient();

    }

    private void setCredentials()
    {
        if (isSecured) {

            // Setting preemtiveAuth manually since org.apache.http does not support it
            preemptiveAuth = new HttpRequestInterceptor()
            {

                @Override
                public void process(HttpRequest request, HttpContext context) throws HttpException, IOException
                {
                    AuthState authState = (AuthState) context.getAttribute(ClientContext.TARGET_AUTH_STATE);
                    CredentialsProvider credsProvider =
                        (CredentialsProvider) context.getAttribute(ClientContext.CREDS_PROVIDER);
                    HttpHost targetHost = (HttpHost) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);

                    if (authState.getAuthScheme() == null) {
                        AuthScope authScope = new AuthScope(targetHost.getHostName(), targetHost.getPort());
                        Credentials creds = credsProvider.getCredentials(authScope);
                        if (creds != null) {
                            authState.setAuthScheme(new BasicScheme());
                            authState.setCredentials(creds);
                        }
                    }
                }

            };

            client.addRequestInterceptor(preemptiveAuth, 0);

            Credentials defaultcreds = new UsernamePasswordCredentials(username, password);
            client.getCredentialsProvider().setCredentials(new AuthScope(null, -1, AuthScope.ANY_REALM), defaultcreds);
        }
    }

}
