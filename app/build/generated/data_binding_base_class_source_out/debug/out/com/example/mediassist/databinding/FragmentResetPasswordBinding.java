// Generated by view binder compiler. Do not edit!
package com.example.mediassist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class FragmentResetPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button SavePwdButtonView;

  @NonNull
  public final TextView confirmnewpassword;

  @NonNull
  public final EditText confirmnewpassword1;

  @NonNull
  public final TextView newpassword;

  @NonNull
  public final EditText newpassword1;

  @NonNull
  public final RelativeLayout pageSigninPageEk1;

  @NonNull
  public final View rectangle7;

  @NonNull
  public final View rectangle8;

  @NonNull
  public final TextView signInToYourAccount;

  private FragmentResetPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button SavePwdButtonView, @NonNull TextView confirmnewpassword,
      @NonNull EditText confirmnewpassword1, @NonNull TextView newpassword,
      @NonNull EditText newpassword1, @NonNull RelativeLayout pageSigninPageEk1,
      @NonNull View rectangle7, @NonNull View rectangle8, @NonNull TextView signInToYourAccount) {
    this.rootView = rootView;
    this.SavePwdButtonView = SavePwdButtonView;
    this.confirmnewpassword = confirmnewpassword;
    this.confirmnewpassword1 = confirmnewpassword1;
    this.newpassword = newpassword;
    this.newpassword1 = newpassword1;
    this.pageSigninPageEk1 = pageSigninPageEk1;
    this.rectangle7 = rectangle7;
    this.rectangle8 = rectangle8;
    this.signInToYourAccount = signInToYourAccount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reset_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SavePwdButtonView;
      Button SavePwdButtonView = ViewBindings.findChildViewById(rootView, id);
      if (SavePwdButtonView == null) {
        break missingId;
      }

      id = R.id.confirmnewpassword_;
      TextView confirmnewpassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmnewpassword == null) {
        break missingId;
      }

      id = R.id.confirmnewpassword;
      EditText confirmnewpassword1 = ViewBindings.findChildViewById(rootView, id);
      if (confirmnewpassword1 == null) {
        break missingId;
      }

      id = R.id.newpassword_;
      TextView newpassword = ViewBindings.findChildViewById(rootView, id);
      if (newpassword == null) {
        break missingId;
      }

      id = R.id.newpassword;
      EditText newpassword1 = ViewBindings.findChildViewById(rootView, id);
      if (newpassword1 == null) {
        break missingId;
      }

      id = R.id.page_signin_page_ek1;
      RelativeLayout pageSigninPageEk1 = ViewBindings.findChildViewById(rootView, id);
      if (pageSigninPageEk1 == null) {
        break missingId;
      }

      id = R.id.rectangle_7;
      View rectangle7 = ViewBindings.findChildViewById(rootView, id);
      if (rectangle7 == null) {
        break missingId;
      }

      id = R.id.rectangle_8;
      View rectangle8 = ViewBindings.findChildViewById(rootView, id);
      if (rectangle8 == null) {
        break missingId;
      }

      id = R.id.sign_in_to_your_account;
      TextView signInToYourAccount = ViewBindings.findChildViewById(rootView, id);
      if (signInToYourAccount == null) {
        break missingId;
      }

      return new FragmentResetPasswordBinding((ConstraintLayout) rootView, SavePwdButtonView,
          confirmnewpassword, confirmnewpassword1, newpassword, newpassword1, pageSigninPageEk1,
          rectangle7, rectangle8, signInToYourAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
