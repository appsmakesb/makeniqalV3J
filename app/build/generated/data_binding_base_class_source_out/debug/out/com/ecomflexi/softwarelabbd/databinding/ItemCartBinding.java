// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ItemCartBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout lytImage;

  @NonNull
  public final MaterialRippleLayout lytParent;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final TextView productQuantity;

  private ItemCartBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout lytImage,
      @NonNull MaterialRippleLayout lytParent, @NonNull ImageView productImage,
      @NonNull TextView productName, @NonNull TextView productPrice,
      @NonNull TextView productQuantity) {
    this.rootView = rootView;
    this.lytImage = lytImage;
    this.lytParent = lytParent;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lyt_image;
      RelativeLayout lytImage = ViewBindings.findChildViewById(rootView, id);
      if (lytImage == null) {
        break missingId;
      }

      id = R.id.lyt_parent;
      MaterialRippleLayout lytParent = ViewBindings.findChildViewById(rootView, id);
      if (lytParent == null) {
        break missingId;
      }

      id = R.id.product_image;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.product_name;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.product_price;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.product_quantity;
      TextView productQuantity = ViewBindings.findChildViewById(rootView, id);
      if (productQuantity == null) {
        break missingId;
      }

      return new ItemCartBinding((RelativeLayout) rootView, lytImage, lytParent, productImage,
          productName, productPrice, productQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
