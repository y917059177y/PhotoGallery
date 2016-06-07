package com.example.xyl.photogallery;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/**
 * Created by XyL on 2016/6/6.
 * 接受PRIVATE广播
 */
public abstract class VisibleFragment extends Fragment {

    public static final String TAG = "VisibleFragment";

    @Override
    public void onStart() {
        super.onStart();

        IntentFilter filter = new IntentFilter(PollService.ACTION_SHOW_NOTIFICATION);
        getActivity().registerReceiver(mOnShowNotification, filter, PollService.PERM_PRIVATE, null);
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().unregisterReceiver(mOnShowNotification);
    }

    private BroadcastReceiver mOnShowNotification = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
//            Toast.makeText(getActivity(),
//                    "Got a broadcast:" + intent.getAction(), Toast.LENGTH_LONG).show();
            Log.i(TAG, "取消通知");
            setResultCode(Activity.RESULT_CANCELED);
        }
    };
}
