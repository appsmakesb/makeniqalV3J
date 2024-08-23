// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

public final class IncludeCartTotalBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCheckout;

  @NonNull
  public final MaterialRippleLayout lytCheckout;

  @NonNull
  public final LinearLayout lytPrice;

  @NonNull
  public final RelativeLayout lytTotal;

  @NonNull
  public final TextView txtTax;

  @NonNull
  public final TextView txtTotalPrice;

  private IncludeCartTotalBinding(@NonNull RelativeLayout rootView, @NonNull Button btnCheckout,
      @NonNull MaterialRippleLayout lytCheckout, @NonNull LinearLayout lytPrice,
      @NonNull RelativeLayout lytTotal, @NonNull TextView txtTax, @NonNull TextView txtTotalPrice) {
    this.rootView = rootView;
    this.btnCheckout = btnCheckout;
    this.lytCheckout = lytCheckout;
    this.lytPrice = lytPrice;
    this.lytTotal = lytTotal;
    this.txtTax = txtTax;
    this.txtTotalPrice = txtTotalPrice;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IncludeCartTotalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IncludeCartTotalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.include_cart_total, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IncludeCartTotalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_checkout;
      Button btnCheckout = ViewBindings.findChildViewById(rootView, id);
      if (btnCheckout == null) {
        break missingId;
      }

      id = R.id.lyt_checkout;
      MaterialRippleLayout lytCheckout = ViewBindings.findChildViewById(rootView, id);
      if (lytCheckout == null) {
        break missingId;
      }

      id = R.id.lyt_price;
      LinearLayout lytPrice = ViewBindings.findChildViewById(rootView, id);
      if (lytPrice == null) {
        break missingId;
      }

      RelativeLayout lytTotal = (RelativeLayout) rootView;

      id = R.id.txt_tax;
      TextView txtTax = ViewBindings.findChildViewById(rootView, id);
      if (txtTax == null) {
        break missingId;
      }

      id = R.id.txt_total_price;
      TextView txtTotalPrice = ViewBindings.findChildViewById(rootView, id);
      if (txtTotalPrice == null) {
        break missingId;
      }

      return new IncludeCartTotalBinding((RelativeLayout) rootView, btnCheckout, lytCheckout,
          lytPrice, lytTotal, txtTax, txtTotalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
