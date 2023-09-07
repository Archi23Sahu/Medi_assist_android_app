// Generated by view binder compiler. Do not edit!
package com.example.mediassist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mediassist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOtpForForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button otpContinueBtnView;

  @NonNull
  public final RelativeLayout otpForgetPwdPage;

  @NonNull
  public final View otpRectangle1;

  @NonNull
  public final View otpRectangle2;

  @NonNull
  public final View otpRectangle3;

  @NonNull
  public final View otpRectangle4;

  @NonNull
  public final TextView otpinfoView;

  private FragmentOtpForForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button otpContinueBtnView, @NonNull RelativeLayout otpForgetPwdPage,
      @NonNull View otpRectangle1, @NonNull View otpRectangle2, @NonNull View otpRectangle3,
      @NonNull View otpRectangle4, @NonNull TextView otpinfoView) {
    this.rootView = rootView;
    this.otpContinueBtnView = otpContinueBtnView;
    this.otpForgetPwdPage = otpForgetPwdPage;
    this.otpRectangle1 = otpRectangle1;
    this.otpRectangle2 = otpRectangle2;
    this.otpRectangle3 = otpRectangle3;
    this.otpRectangle4 = otpRectangle4;
    this.otpinfoView = otpinfoView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtpForForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtpForForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_otp_for_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtpForForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.otpContinueBtnView;
      Button otpContinueBtnView = ViewBindings.findChildViewById(rootView, id);
      if (otpContinueBtnView == null) {
        break missingId;
      }

      id = R.id.otp_forget_pwd_page;
      RelativeLayout otpForgetPwdPage = ViewBindings.findChildViewById(rootView, id);
      if (otpForgetPwdPage == null) {
        break missingId;
      }

      id = R.id.otpRectangle1;
      View otpRectangle1 = ViewBindings.findChildViewById(rootView, id);
      if (otpRectangle1 == null) {
        break missingId;
      }

      id = R.id.otpRectangle2;
      View otpRectangle2 = ViewBindings.findChildViewById(rootView, id);
      if (otpRectangle2 == null) {
        break missingId;
      }

      id = R.id.otpRectangle3;
      View otpRectangle3 = ViewBindings.findChildViewById(rootView, id);
      if (otpRectangle3 == null) {
        break missingId;
      }

      id = R.id.otpRectangle4;
      View otpRectangle4 = ViewBindings.findChildViewById(rootView, id);
      if (otpRectangle4 == null) {
        break missingId;
      }

      id = R.id.otpinfoView;
      TextView otpinfoView = ViewBindings.findChildViewById(rootView, id);
      if (otpinfoView == null) {
        break missingId;
      }

      return new FragmentOtpForForgotPasswordBinding((ConstraintLayout) rootView,
          otpContinueBtnView, otpForgetPwdPage, otpRectangle1, otpRectangle2, otpRectangle3,
          otpRectangle4, otpinfoView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
