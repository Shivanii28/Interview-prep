// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView contestid;

  @NonNull
  public final TextView courseid;

  @NonNull
  public final TextView sheetid;

  @NonNull
  public final TextView youtubeid;

  private ActivityDsBinding(@NonNull LinearLayout rootView, @NonNull TextView contestid,
      @NonNull TextView courseid, @NonNull TextView sheetid, @NonNull TextView youtubeid) {
    this.rootView = rootView;
    this.contestid = contestid;
    this.courseid = courseid;
    this.sheetid = sheetid;
    this.youtubeid = youtubeid;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ds, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contestid;
      TextView contestid = ViewBindings.findChildViewById(rootView, id);
      if (contestid == null) {
        break missingId;
      }

      id = R.id.courseid;
      TextView courseid = ViewBindings.findChildViewById(rootView, id);
      if (courseid == null) {
        break missingId;
      }

      id = R.id.sheetid;
      TextView sheetid = ViewBindings.findChildViewById(rootView, id);
      if (sheetid == null) {
        break missingId;
      }

      id = R.id.youtubeid;
      TextView youtubeid = ViewBindings.findChildViewById(rootView, id);
      if (youtubeid == null) {
        break missingId;
      }

      return new ActivityDsBinding((LinearLayout) rootView, contestid, courseid, sheetid,
          youtubeid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}