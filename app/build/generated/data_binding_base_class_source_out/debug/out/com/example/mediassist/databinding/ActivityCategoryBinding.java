// Generated by view binder compiler. Do not edit!
package com.example.mediassist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mediassist.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCategoryBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final MaterialButton btnBack;

  @NonNull
  public final MaterialButton clinicBtnAdd;

  @NonNull
  public final TextView textTitle;

  private ActivityCategoryBinding(@NonNull CoordinatorLayout rootView,
      @NonNull MaterialButton btnBack, @NonNull MaterialButton clinicBtnAdd,
      @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.clinicBtnAdd = clinicBtnAdd;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      MaterialButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.clinicBtnAdd;
      MaterialButton clinicBtnAdd = ViewBindings.findChildViewById(rootView, id);
      if (clinicBtnAdd == null) {
        break missingId;
      }

      id = R.id.textTitle;
      TextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new ActivityCategoryBinding((CoordinatorLayout) rootView, btnBack, clinicBtnAdd,
          textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
