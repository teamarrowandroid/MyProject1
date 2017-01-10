package com.example.harpreetsingh.myproject1;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by harpreetsingh on 2017-01-10.
 */

public class NewService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public NewService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
    
}
