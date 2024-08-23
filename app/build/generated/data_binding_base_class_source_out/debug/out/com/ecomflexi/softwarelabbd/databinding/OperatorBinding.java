// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OperatorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final GridView atachview;

  @NonNull
  public final TextView band;

  @NonNull
  public final CircleImageView hm;

  @NonNull
  public final CircleImageView ivCircularUserImage;

  @NonNull
  public final LinearLayout mainlayout;

  @NonNull
  public final TextView tname;

  @NonNull
  public final RelativeLayout twobd;

  @NonNull
  public final RelativeLayout uitop;

  private OperatorBinding(@NonNull LinearLayout rootView, @NonNull GridView atachview,
      @NonNull TextView band, @NonNull CircleImageView hm,
      @NonNull CircleImageView ivCircularUserImage, @NonNull LinearLayout mainlayout,
      @NonNull TextView tname, @NonNull RelativeLayout twobd, @NonNull RelativeLayout uitop) {
    this.rootView = rootView;
    this.atachview = atachview;
    this.band = band;
    this.hm = hm;
    this.ivCircularUserImage = ivCircularUserImage;
    this.mainlayout = mainlayout;
    this.tname = tname;
    this.twobd = twobd;
    this.uitop = uitop;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OperatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OperatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.operator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OperatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.atachview;
      GridView atachview = ViewBindings.findChildViewById(rootView, id);
      if (atachview == null) {
        break missingId;
      }

      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.hm;
      CircleImageView hm = ViewBindings.findChildViewById(rootView, id);
      if (hm == null) {
        break missingId;
      }

      id = R.id.iv_circular_user_image;
      CircleImageView ivCircularUserImage = ViewBindings.findChildViewById(rootView, id);
      if (ivCircularUserImage == null) {
        break missingId;
      }

      LinearLayout mainlayout = (LinearLayout) rootView;

      id = R.id.tname;
      TextView tname = ViewBindings.findChildViewById(rootView, id);
      if (tname == null) {
        break missingId;
      }

      id = R.id.twobd;
      RelativeLayout twobd = ViewBindings.findChildViewById(rootView, id);
      if (twobd == null) {
        break missingId;
      }

      id = R.id.uitop;
      RelativeLayout uitop = ViewBindings.findChildViewById(rootView, id);
      if (uitop == null) {
        break missingId;
      }

      return new OperatorBinding((LinearLayout) rootView, atachview, band, hm, ivCircularUserImage,
          mainlayout, tname, twobd, uitop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
