// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProjectListBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView AIid;

  @NonNull
  public final ImageView MLid;

  @NonNull
  public final ImageView android;

  @NonNull
  public final ImageView javaid;

  @NonNull
  public final ImageView pythonid;

  @NonNull
  public final ImageView webid;

  private ActivityProjectListBinding(@NonNull ScrollView rootView, @NonNull ImageView AIid,
      @NonNull ImageView MLid, @NonNull ImageView android, @NonNull ImageView javaid,
      @NonNull ImageView pythonid, @NonNull ImageView webid) {
    this.rootView = rootView;
    this.AIid = AIid;
    this.MLid = MLid;
    this.android = android;
    this.javaid = javaid;
    this.pythonid = pythonid;
    this.webid = webid;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProjectListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProjectListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_project_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProjectListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AIid;
      ImageView AIid = ViewBindings.findChildViewById(rootView, id);
      if (AIid == null) {
        break missingId;
      }

      id = R.id.MLid;
      ImageView MLid = ViewBindings.findChildViewById(rootView, id);
      if (MLid == null) {
        break missingId;
      }

      id = R.id.android;
      ImageView android = ViewBindings.findChildViewById(rootView, id);
      if (android == null) {
        break missingId;
      }

      id = R.id.javaid;
      ImageView javaid = ViewBindings.findChildViewById(rootView, id);
      if (javaid == null) {
        break missingId;
      }

      id = R.id.pythonid;
      ImageView pythonid = ViewBindings.findChildViewById(rootView, id);
      if (pythonid == null) {
        break missingId;
      }

      id = R.id.webid;
      ImageView webid = ViewBindings.findChildViewById(rootView, id);
      if (webid == null) {
        break missingId;
      }

      return new ActivityProjectListBinding((ScrollView) rootView, AIid, MLid, android, javaid,
          pythonid, webid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
