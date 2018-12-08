package com.example.miguelangel.tpdm_u5_ejercicio3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Bundle extras = intent.getExtras();
        Object[] pdus = (Object[]) extras.get("pdus");
        SmsMessage mensaje=SmsMessage.createFromPdu((byte[])pdus[0]);

        Toast.makeText(context, "TELEFONO ORIGEN: "+mensaje.getOriginatingAddress()+" CONTENIDO: "+mensaje.getMessageBody(), Toast.LENGTH_LONG).show();
        String texto=mensaje.getMessageBody();
        if (texto.startsWith("CALIFICACON")){
            String[] parametros=texto.split(" ");
            if (parametros.length==3){

            }
        }
        //CALIFICACION 15400987 UNIDAD1
    }
}
