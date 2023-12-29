// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDashboardBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView CPid;

  @NonNull
  public final TextView DSid;

  @NonNull
  public final TextView algoid;

  @NonNull
  public final TextView coreid;

  @NonNull
  public final TextView placementid;

  @NonNull
  public final TextView projectideaid;

  private ActivityDashboardBinding(@NonNull ScrollView rootView, @NonNull TextView CPid,
      @NonNull TextView DSid, @NonNull TextView algoid, @NonNull TextView coreid,
      @NonNull TextView placementid, @NonNull TextView projectideaid) {
    this.rootView = rootView;
    this.CPid = CPid;
    this.DSid = DSid;
    this.algoid = algoid;
    this.coreid = coreid;
    this.placementid = placementid;
    this.projectideaid = projectideaid;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CPid;
      TextView CPid = ViewBindings.findChildViewById(rootView, id);
      if (CPid == null) {
        break missingId;
      }

      id = R.id.DSid;
      TextView DSid = ViewBindings.findChildViewById(rootView, id);
      if (DSid == null) {
        break missingId;
      }

      id = R.id.algoid;
      TextView algoid = ViewBindings.findChildViewById(rootView, id);
      if (algoid == null) {
        break missingId;
      }

      id = R.id.coreid;
      TextView coreid = ViewBindings.findChildViewById(rootView, id);
      if (coreid == null) {
        break missingId;
      }

      id = R.id.placementid;
      TextView placementid = ViewBindings.findChildViewById(rootView, id);
      if (placementid == null) {
        break missingId;
      }

      id = R.id.projectideaid;
      TextView projectideaid = ViewBindings.findChildViewById(rootView, id);
      if (projectideaid == null) {
        break missingId;
      }

      return new ActivityDashboardBinding((ScrollView) rootView, CPid, DSid, algoid, coreid,
          placementid, projectideaid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}