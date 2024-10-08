// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
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

public final class AddBalanceTypeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RadioButton auto;

  @NonNull
  public final RadioGroup bal;

  @NonNull
  public final TextView band;

  @NonNull
  public final RadioButton bank;

  @NonNull
  public final TextView cba;

  @NonNull
  public final RadioButton drive;

  @NonNull
  public final CircleImageView hm;

  @NonNull
  public final RadioButton main;

  @NonNull
  public final LinearLayout mainlayout;

  @NonNull
  public final RadioButton manual;

  @NonNull
  public final RadioGroup pType;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final Button sub;

  @NonNull
  public final RelativeLayout uitop;

  private AddBalanceTypeBinding(@NonNull LinearLayout rootView, @NonNull RadioButton auto,
      @NonNull RadioGroup bal, @NonNull TextView band, @NonNull RadioButton bank,
      @NonNull TextView cba, @NonNull RadioButton drive, @NonNull CircleImageView hm,
      @NonNull RadioButton main, @NonNull LinearLayout mainlayout, @NonNull RadioButton manual,
      @NonNull RadioGroup pType, @NonNull ScrollView scrollview, @NonNull Button sub,
      @NonNull RelativeLayout uitop) {
    this.rootView = rootView;
    this.auto = auto;
    this.bal = bal;
    this.band = band;
    this.bank = bank;
    this.cba = cba;
    this.drive = drive;
    this.hm = hm;
    this.main = main;
    this.mainlayout = mainlayout;
    this.manual = manual;
    this.pType = pType;
    this.scrollview = scrollview;
    this.sub = sub;
    this.uitop = uitop;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddBalanceTypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddBalanceTypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_balance_type, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddBalanceTypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auto;
      RadioButton auto = ViewBindings.findChildViewById(rootView, id);
      if (auto == null) {
        break missingId;
      }

      id = R.id.bal;
      RadioGroup bal = ViewBindings.findChildViewById(rootView, id);
      if (bal == null) {
        break missingId;
      }

      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.bank;
      RadioButton bank = ViewBindings.findChildViewById(rootView, id);
      if (bank == null) {
        break missingId;
      }

      id = R.id.cba;
      TextView cba = ViewBindings.findChildViewById(rootView, id);
      if (cba == null) {
        break missingId;
      }

      id = R.id.drive;
      RadioButton drive = ViewBindings.findChildViewById(rootView, id);
      if (drive == null) {
        break missingId;
      }

      id = R.id.hm;
      CircleImageView hm = ViewBindings.findChildViewById(rootView, id);
      if (hm == null) {
        break missingId;
      }

      id = R.id.main;
      RadioButton main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      LinearLayout mainlayout = (LinearLayout) rootView;

      id = R.id.manual;
      RadioButton manual = ViewBindings.findChildViewById(rootView, id);
      if (manual == null) {
        break missingId;
      }

      id = R.id.p_type;
      RadioGroup pType = ViewBindings.findChildViewById(rootView, id);
      if (pType == null) {
        break missingId;
      }

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.uitop;
      RelativeLayout uitop = ViewBindings.findChildViewById(rootView, id);
      if (uitop == null) {
        break missingId;
      }

      return new AddBalanceTypeBinding((LinearLayout) rootView, auto, bal, band, bank, cba, drive,
          hm, main, mainlayout, manual, pType, scrollview, sub, uitop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
