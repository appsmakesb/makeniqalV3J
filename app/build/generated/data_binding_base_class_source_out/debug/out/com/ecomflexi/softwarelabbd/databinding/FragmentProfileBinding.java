// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.balysv.materialripple.MaterialRippleLayout;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialRippleLayout btnEditUser;

  @NonNull
  public final MaterialRippleLayout btnOrderHistory;

  @NonNull
  public final MaterialRippleLayout btnPrivacy;

  @NonNull
  public final MaterialRippleLayout btnRate;

  @NonNull
  public final MaterialRippleLayout btnShare;

  @NonNull
  public final LinearLayout lytRoot;

  @NonNull
  public final TextView txtUserAddress;

  @NonNull
  public final TextView txtUserEmail;

  @NonNull
  public final TextView txtUserName;

  @NonNull
  public final TextView txtUserPhone;

  private FragmentProfileBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialRippleLayout btnEditUser, @NonNull MaterialRippleLayout btnOrderHistory,
      @NonNull MaterialRippleLayout btnPrivacy, @NonNull MaterialRippleLayout btnRate,
      @NonNull MaterialRippleLayout btnShare, @NonNull LinearLayout lytRoot,
      @NonNull TextView txtUserAddress, @NonNull TextView txtUserEmail,
      @NonNull TextView txtUserName, @NonNull TextView txtUserPhone) {
    this.rootView = rootView;
    this.btnEditUser = btnEditUser;
    this.btnOrderHistory = btnOrderHistory;
    this.btnPrivacy = btnPrivacy;
    this.btnRate = btnRate;
    this.btnShare = btnShare;
    this.lytRoot = lytRoot;
    this.txtUserAddress = txtUserAddress;
    this.txtUserEmail = txtUserEmail;
    this.txtUserName = txtUserName;
    this.txtUserPhone = txtUserPhone;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_edit_user;
      MaterialRippleLayout btnEditUser = ViewBindings.findChildViewById(rootView, id);
      if (btnEditUser == null) {
        break missingId;
      }

      id = R.id.btn_order_history;
      MaterialRippleLayout btnOrderHistory = ViewBindings.findChildViewById(rootView, id);
      if (btnOrderHistory == null) {
        break missingId;
      }

      id = R.id.btn_privacy;
      MaterialRippleLayout btnPrivacy = ViewBindings.findChildViewById(rootView, id);
      if (btnPrivacy == null) {
        break missingId;
      }

      id = R.id.btn_rate;
      MaterialRippleLayout btnRate = ViewBindings.findChildViewById(rootView, id);
      if (btnRate == null) {
        break missingId;
      }

      id = R.id.btn_share;
      MaterialRippleLayout btnShare = ViewBindings.findChildViewById(rootView, id);
      if (btnShare == null) {
        break missingId;
      }

      LinearLayout lytRoot = (LinearLayout) rootView;

      id = R.id.txt_user_address;
      TextView txtUserAddress = ViewBindings.findChildViewById(rootView, id);
      if (txtUserAddress == null) {
        break missingId;
      }

      id = R.id.txt_user_email;
      TextView txtUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtUserEmail == null) {
        break missingId;
      }

      id = R.id.txt_user_name;
      TextView txtUserName = ViewBindings.findChildViewById(rootView, id);
      if (txtUserName == null) {
        break missingId;
      }

      id = R.id.txt_user_phone;
      TextView txtUserPhone = ViewBindings.findChildViewById(rootView, id);
      if (txtUserPhone == null) {
        break missingId;
      }

      return new FragmentProfileBinding((LinearLayout) rootView, btnEditUser, btnOrderHistory,
          btnPrivacy, btnRate, btnShare, lytRoot, txtUserAddress, txtUserEmail, txtUserName,
          txtUserPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
