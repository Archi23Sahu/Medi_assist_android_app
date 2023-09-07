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

public final class ClinicAdminLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView clinicAcceptedAppointmentsCard;

  @NonNull
  public final CardView clinicCancelledAppointmentsCard;

  @NonNull
  public final CardView clinicCategoryCard;

  @NonNull
  public final CardView clinicDoctorCard;

  @NonNull
  public final CardView clinicPendingAppointmentsCard;

  private ClinicAdminLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView clinicAcceptedAppointmentsCard,
      @NonNull CardView clinicCancelledAppointmentsCard, @NonNull CardView clinicCategoryCard,
      @NonNull CardView clinicDoctorCard, @NonNull CardView clinicPendingAppointmentsCard) {
    this.rootView = rootView;
    this.clinicAcceptedAppointmentsCard = clinicAcceptedAppointmentsCard;
    this.clinicCancelledAppointmentsCard = clinicCancelledAppointmentsCard;
    this.clinicCategoryCard = clinicCategoryCard;
    this.clinicDoctorCard = clinicDoctorCard;
    this.clinicPendingAppointmentsCard = clinicPendingAppointmentsCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ClinicAdminLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ClinicAdminLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.clinic_admin_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ClinicAdminLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clinic_accepted_appointments_card;
      CardView clinicAcceptedAppointmentsCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicAcceptedAppointmentsCard == null) {
        break missingId;
      }

      id = R.id.clinic_cancelled_appointments_card;
      CardView clinicCancelledAppointmentsCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicCancelledAppointmentsCard == null) {
        break missingId;
      }

      id = R.id.clinic_category_card;
      CardView clinicCategoryCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicCategoryCard == null) {
        break missingId;
      }

      id = R.id.clinic_doctor_card;
      CardView clinicDoctorCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicDoctorCard == null) {
        break missingId;
      }

      id = R.id.clinic_pending_appointments_card;
      CardView clinicPendingAppointmentsCard = ViewBindings.findChildViewById(rootView, id);
      if (clinicPendingAppointmentsCard == null) {
        break missingId;
      }

      return new ClinicAdminLayoutBinding((ConstraintLayout) rootView,
          clinicAcceptedAppointmentsCard, clinicCancelledAppointmentsCard, clinicCategoryCard,
          clinicDoctorCard, clinicPendingAppointmentsCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
