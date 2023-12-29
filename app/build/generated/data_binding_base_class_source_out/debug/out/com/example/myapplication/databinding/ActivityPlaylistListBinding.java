// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPlaylistListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView BTid;

  @NonNull
  public final TextView DMAid;

  @NonNull
  public final TextView LLid;

  @NonNull
  public final TextView arrayid;

  @NonNull
  public final TextView backtrackingid;

  @NonNull
  public final TextView basicid;

  @NonNull
  public final TextView dpid;

  @NonNull
  public final TextView graphid;

  @NonNull
  public final TextView greedyid;

  @NonNull
  public final TextView heapid;

  @NonNull
  public final TextView pointerid;

  @NonNull
  public final TextView queueid;

  @NonNull
  public final TextView recursionid;

  @NonNull
  public final TextView serachingid;

  @NonNull
  public final TextView stackid;

  @NonNull
  public final TextView stlid;

  @NonNull
  public final TextView stringid;

  private ActivityPlaylistListBinding(@NonNull RelativeLayout rootView, @NonNull TextView BTid,
      @NonNull TextView DMAid, @NonNull TextView LLid, @NonNull TextView arrayid,
      @NonNull TextView backtrackingid, @NonNull TextView basicid, @NonNull TextView dpid,
      @NonNull TextView graphid, @NonNull TextView greedyid, @NonNull TextView heapid,
      @NonNull TextView pointerid, @NonNull TextView queueid, @NonNull TextView recursionid,
      @NonNull TextView serachingid, @NonNull TextView stackid, @NonNull TextView stlid,
      @NonNull TextView stringid) {
    this.rootView = rootView;
    this.BTid = BTid;
    this.DMAid = DMAid;
    this.LLid = LLid;
    this.arrayid = arrayid;
    this.backtrackingid = backtrackingid;
    this.basicid = basicid;
    this.dpid = dpid;
    this.graphid = graphid;
    this.greedyid = greedyid;
    this.heapid = heapid;
    this.pointerid = pointerid;
    this.queueid = queueid;
    this.recursionid = recursionid;
    this.serachingid = serachingid;
    this.stackid = stackid;
    this.stlid = stlid;
    this.stringid = stringid;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPlaylistListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPlaylistListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_playlist_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPlaylistListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BTid;
      TextView BTid = ViewBindings.findChildViewById(rootView, id);
      if (BTid == null) {
        break missingId;
      }

      id = R.id.DMAid;
      TextView DMAid = ViewBindings.findChildViewById(rootView, id);
      if (DMAid == null) {
        break missingId;
      }

      id = R.id.LLid;
      TextView LLid = ViewBindings.findChildViewById(rootView, id);
      if (LLid == null) {
        break missingId;
      }

      id = R.id.arrayid;
      TextView arrayid = ViewBindings.findChildViewById(rootView, id);
      if (arrayid == null) {
        break missingId;
      }

      id = R.id.backtrackingid;
      TextView backtrackingid = ViewBindings.findChildViewById(rootView, id);
      if (backtrackingid == null) {
        break missingId;
      }

      id = R.id.basicid;
      TextView basicid = ViewBindings.findChildViewById(rootView, id);
      if (basicid == null) {
        break missingId;
      }

      id = R.id.dpid;
      TextView dpid = ViewBindings.findChildViewById(rootView, id);
      if (dpid == null) {
        break missingId;
      }

      id = R.id.graphid;
      TextView graphid = ViewBindings.findChildViewById(rootView, id);
      if (graphid == null) {
        break missingId;
      }

      id = R.id.greedyid;
      TextView greedyid = ViewBindings.findChildViewById(rootView, id);
      if (greedyid == null) {
        break missingId;
      }

      id = R.id.heapid;
      TextView heapid = ViewBindings.findChildViewById(rootView, id);
      if (heapid == null) {
        break missingId;
      }

      id = R.id.pointerid;
      TextView pointerid = ViewBindings.findChildViewById(rootView, id);
      if (pointerid == null) {
        break missingId;
      }

      id = R.id.queueid;
      TextView queueid = ViewBindings.findChildViewById(rootView, id);
      if (queueid == null) {
        break missingId;
      }

      id = R.id.recursionid;
      TextView recursionid = ViewBindings.findChildViewById(rootView, id);
      if (recursionid == null) {
        break missingId;
      }

      id = R.id.serachingid;
      TextView serachingid = ViewBindings.findChildViewById(rootView, id);
      if (serachingid == null) {
        break missingId;
      }

      id = R.id.stackid;
      TextView stackid = ViewBindings.findChildViewById(rootView, id);
      if (stackid == null) {
        break missingId;
      }

      id = R.id.stlid;
      TextView stlid = ViewBindings.findChildViewById(rootView, id);
      if (stlid == null) {
        break missingId;
      }

      id = R.id.stringid;
      TextView stringid = ViewBindings.findChildViewById(rootView, id);
      if (stringid == null) {
        break missingId;
      }

      return new ActivityPlaylistListBinding((RelativeLayout) rootView, BTid, DMAid, LLid, arrayid,
          backtrackingid, basicid, dpid, graphid, greedyid, heapid, pointerid, queueid, recursionid,
          serachingid, stackid, stlid, stringid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}