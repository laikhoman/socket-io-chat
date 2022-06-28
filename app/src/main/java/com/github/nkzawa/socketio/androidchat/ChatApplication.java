package com.github.nkzawa.socketio.androidchat;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class ChatApplication extends Application {

    private Socket mSocket;
    {
        try {
//            mSocket = IO.socket(Constants.CHAT_SERVER_URL);
//            mSocket = IO.socket("http://192.168.51.61:8445");
            mSocket = IO.socket("http://192.168.80.213:8445");

//            Log.d("id", mSocket.id());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.printStackTrace();
        }

        mSocket.connect();
    }

    public Socket getSocket() {
        return mSocket;
    }

}
