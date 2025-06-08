package com.example.miprimeraplicacion;

import com.google.firebase.messaging.FirebaseMessaging;Add commentMore actions
import com.google.firebase.messaging.FirebaseMessagingService;

import java.util.concurrent.atomic.AtomicReference;

public class MyFirebaseInstanceIDService  extends FirebaseMessagingService {
    public String obtenerToken(){
        AtomicReference<String> token = null;
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(task -> {
            if( !task.isSuccessful() ){
                return;
            }
            token.set(task.getResult());
        });
        return token.get();
    }
}
