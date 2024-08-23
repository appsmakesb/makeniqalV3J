// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListviewItemRBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView bank;

  @NonNull
  public final TextView drive;

  @NonNull
  public final TextView email;

  @NonNull
  public final LinearLayout first;

  @NonNull
  public final ImageView firstt;

  @NonNull
  public final LinearLayout four;

  @NonNull
  public final TextView main;

  @NonNull
  public final TextView mobile;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView type;

  private ListviewItemRBinding(@NonNull LinearLayout rootView, @NonNull TextView bank,
      @NonNull TextView drive, @NonNull TextView email, @NonNull LinearLayout first,
      @NonNull ImageView firstt, @NonNull LinearLayout four, @NonNull TextView main,
      @NonNull TextView mobile, @NonNull TextView name, @NonNull TextView type) {
    this.rootView = rootView;
    this.bank = bank;
    this.drive = drive;
    this.email = email;
    this.first = first;
    this.firstt = firstt;
    this.four = four;
    this.main = main;
    this.mobile = mobile;
    this.name = name;
    this.type = type;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListviewItemRBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListviewItemRBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.listview_item_r, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListviewItemRBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bank;
      TextView bank = ViewBindings.findChildViewById(rootView, id);
      if (bank == null) {
        break missingId;
      }

      id = R.id.drive;
      TextView drive = ViewBindings.findChildViewById(rootView, id);
      if (drive == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.first;
      LinearLayout first = ViewBindings.findChildViewById(rootView, id);
      if (first == null) {
        break missingId;
      }

      id = R.id.firstt;
      ImageView firstt = ViewBindings.findChildViewById(rootView, id);
      if (firstt == null) {
        break missingId;
      }

      id = R.id.four;
      LinearLayout four = ViewBindings.findChildViewById(rootView, id);
      if (four == null) {
        break missingId;
      }

      id = R.id.main;
      TextView main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      id = R.id.mobile;
      TextView mobile = ViewBindings.findChildViewById(rootView, id);
      if (mobile == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.type;
      TextView type = ViewBindings.findChildViewById(rootView, id);
      if (type == null) {
        break missingId;
      }

      return new ListviewItemRBinding((LinearLayout) rootView, bank, drive, email, first, firstt,
          four, main, mobile, name, type);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
