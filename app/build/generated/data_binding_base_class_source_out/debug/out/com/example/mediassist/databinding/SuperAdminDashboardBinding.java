// Generated by view binder compiler. Do not edit!
package com.example.mediassist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mediassist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SuperAdminDashboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView clinicAdminCard;

  @NonNull
  public final ClinicAdminLayoutBinding clinicAdminLayout;

  @NonNull
  public final CardView clinicCard;

  private SuperAdminDashboardBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView clinicAdminCard, @NonNull ClinicAdminLayoutBinding clinicAdminLayout,
      @NonNull CardView clinicCard) {
    this.rootView = rootView;
    this.clinicAdminCard = clinicAdminCard;
    this.clinicAdminLayout = clinicAdminLayout;
    this.clinicCard = clinicCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SuperAdminDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SuperAdminDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.super_admin_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SuperAdminDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clinic_admin_card;
      CardView clinicAdminCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicAdminCard == null) {
        break missingId;
      }

      id = R.id.clinic_admin_layout;
      View clinicAdminLayout = ViewBindings.findChildViewById(rootView, id);
      if (clinicAdminLayout == null) {
        break missingId;
      }
      ClinicAdminLayoutBinding binding_clinicAdminLayout = ClinicAdminLayoutBinding.bind(clinicAdminLayout);

      id = R.id.clinic_card;
      CardView clinicCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicCard == null) {
        break missingId;
      }

      return new SuperAdminDashboardBinding((ConstraintLayout) rootView, clinicAdminCard,
          binding_clinicAdminLayout, clinicCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
