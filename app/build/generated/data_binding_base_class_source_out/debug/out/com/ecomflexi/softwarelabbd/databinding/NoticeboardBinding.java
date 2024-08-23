// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoticeboardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView cba;

  @NonNull
  public final TextView emptyListView;

  @NonNull
  public final LinearLayout four;

  @NonNull
  public final ListView listview;

  private NoticeboardBinding(@NonNull LinearLayout rootView, @NonNull TextView cba,
      @NonNull TextView emptyListView, @NonNull LinearLayout four, @NonNull ListView listview) {
    this.rootView = rootView;
    this.cba = cba;
    this.emptyListView = emptyListView;
    this.four = four;
    this.listview = listview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NoticeboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoticeboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.noticeboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoticeboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cba;
      TextView cba = ViewBindings.findChildViewById(rootView, id);
      if (cba == null) {
        break missingId;
      }

      id = R.id.empty_list_view;
      TextView emptyListView = ViewBindings.findChildViewById(rootView, id);
      if (emptyListView == null) {
        break missingId;
      }

      id = R.id.four;
      LinearLayout four = ViewBindings.findChildViewById(rootView, id);
      if (four == null) {
        break missingId;
      }

      id = R.id.listview;
      ListView listview = ViewBindings.findChildViewById(rootView, id);
      if (listview == null) {
        break missingId;
      }

      return new NoticeboardBinding((LinearLayout) rootView, cba, emptyListView, four, listview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
