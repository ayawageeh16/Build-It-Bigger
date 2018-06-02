package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class AsyncTaskTest extends AndroidTestCase {

    @SuppressWarnings("unchecked")
    public void test() {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.i("", "test: success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
