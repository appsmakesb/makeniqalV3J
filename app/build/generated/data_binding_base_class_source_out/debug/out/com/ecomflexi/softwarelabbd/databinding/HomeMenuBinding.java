// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeMenuBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView close;

  @NonNull
  public final Button lock;

  @NonNull
  public final Button logo;

  @NonNull
  public final Button pass;

  @NonNull
  public final Button pinm;

  @NonNull
  public final Button sup;

  private HomeMenuBinding(@NonNull RelativeLayout rootView, @NonNull ImageView close,
      @NonNull Button lock, @NonNull Button logo, @NonNull Button pass, @NonNull Button pinm,
      @NonNull Button sup) {
    this.rootView = rootView;
    this.close = close;
    this.lock = lock;
    this.logo = logo;
    this.pass = pass;
    this.pinm = pinm;
    this.sup = sup;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close;
      ImageView close = ViewBindings.findChildViewById(rootView, id);
      if (close == null) {
        break missingId;
      }

      id = R.id.lock;
      Button lock = ViewBindings.findChildViewById(rootView, id);
      if (lock == null) {
        break missingId;
      }

      id = R.id.logo;
      Button logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.pass;
      Button pass = ViewBindings.findChildViewById(rootView, id);
      if (pass == null) {
        break missingId;
      }

      id = R.id.pinm;
      Button pinm = ViewBindings.findChildViewById(rootView, id);
      if (pinm == null) {
        break missingId;
      }

      id = R.id.sup;
      Button sup = ViewBindings.findChildViewById(rootView, id);
      if (sup == null) {
        break missingId;
      }

      return new HomeMenuBinding((RelativeLayout) rootView, close, lock, logo, pass, pinm, sup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
