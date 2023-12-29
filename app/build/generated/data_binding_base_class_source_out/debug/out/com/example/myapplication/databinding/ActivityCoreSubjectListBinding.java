// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCoreSubjectListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button CNid;

  @NonNull
  public final Button dbmsid;

  @NonNull
  public final Button oopsid;

  @NonNull
  public final Button osid;

  private ActivityCoreSubjectListBinding(@NonNull LinearLayout rootView, @NonNull Button CNid,
      @NonNull Button dbmsid, @NonNull Button oopsid, @NonNull Button osid) {
    this.rootView = rootView;
    this.CNid = CNid;
    this.dbmsid = dbmsid;
    this.oopsid = oopsid;
    this.osid = osid;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCoreSubjectListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCoreSubjectListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_core_subject_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCoreSubjectListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CNid;
      Button CNid = ViewBindings.findChildViewById(rootView, id);
      if (CNid == null) {
        break missingId;
      }

      id = R.id.dbmsid;
      Button dbmsid = ViewBindings.findChildViewById(rootView, id);
      if (dbmsid == null) {
        break missingId;
      }

      id = R.id.oopsid;
      Button oopsid = ViewBindings.findChildViewById(rootView, id);
      if (oopsid == null) {
        break missingId;
      }

      id = R.id.osid;
      Button osid = ViewBindings.findChildViewById(rootView, id);
      if (osid == null) {
        break missingId;
      }

      return new ActivityCoreSubjectListBinding((LinearLayout) rootView, CNid, dbmsid, oopsid,
          osid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}