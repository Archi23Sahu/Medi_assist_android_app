// Generated by view binder compiler. Do not edit!
package com.example.mediassist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mediassist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView registerEmailErrorText;

  @NonNull
  public final TextView registerEmailErrorText2;

  @NonNull
  public final TextView registerEmailLabel;

  @NonNull
  public final EditText registerEmailText;

  @NonNull
  public final TextView registerNameErrorText;

  @NonNull
  public final TextView registerNameLabel;

  @NonNull
  public final EditText registerNameText;

  @NonNull
  public final TextView registerPhoneNumberErrorText;

  @NonNull
  public final TextView registerPhoneNumberErrorText2;

  @NonNull
  public final TextView registerPhoneNumberLabel;

  @NonNull
  public final EditText registerPhoneNumberText;

  @NonNull
  public final ProgressBar registerProgressBar;

  @NonNull
  public final TextView registerPwdErrorText;

  @NonNull
  public final TextView registerPwdLabel;

  @NonNull
  public final EditText registerPwdText;

  @NonNull
  public final TextView registerRepwdErrorText;

  @NonNull
  public final TextView registerRepwdLabel;

  @NonNull
  public final EditText registerRepwdText;

  @NonNull
  public final TextView signup;

  @NonNull
  public final Button signupButton;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView registerEmailErrorText, @NonNull TextView registerEmailErrorText2,
      @NonNull TextView registerEmailLabel, @NonNull EditText registerEmailText,
      @NonNull TextView registerNameErrorText, @NonNull TextView registerNameLabel,
      @NonNull EditText registerNameText, @NonNull TextView registerPhoneNumberErrorText,
      @NonNull TextView registerPhoneNumberErrorText2, @NonNull TextView registerPhoneNumberLabel,
      @NonNull EditText registerPhoneNumberText, @NonNull ProgressBar registerProgressBar,
      @NonNull TextView registerPwdErrorText, @NonNull TextView registerPwdLabel,
      @NonNull EditText registerPwdText, @NonNull TextView registerRepwdErrorText,
      @NonNull TextView registerRepwdLabel, @NonNull EditText registerRepwdText,
      @NonNull TextView signup, @NonNull Button signupButton) {
    this.rootView = rootView;
    this.registerEmailErrorText = registerEmailErrorText;
    this.registerEmailErrorText2 = registerEmailErrorText2;
    this.registerEmailLabel = registerEmailLabel;
    this.registerEmailText = registerEmailText;
    this.registerNameErrorText = registerNameErrorText;
    this.registerNameLabel = registerNameLabel;
    this.registerNameText = registerNameText;
    this.registerPhoneNumberErrorText = registerPhoneNumberErrorText;
    this.registerPhoneNumberErrorText2 = registerPhoneNumberErrorText2;
    this.registerPhoneNumberLabel = registerPhoneNumberLabel;
    this.registerPhoneNumberText = registerPhoneNumberText;
    this.registerProgressBar = registerProgressBar;
    this.registerPwdErrorText = registerPwdErrorText;
    this.registerPwdLabel = registerPwdLabel;
    this.registerPwdText = registerPwdText;
    this.registerRepwdErrorText = registerRepwdErrorText;
    this.registerRepwdLabel = registerRepwdLabel;
    this.registerRepwdText = registerRepwdText;
    this.signup = signup;
    this.signupButton = signupButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.register_email_error_text;
      TextView registerEmailErrorText = ViewBindings.findChildViewById(rootView, id);
      if (registerEmailErrorText == null) {
        break missingId;
      }

      id = R.id.register_email_error_text2;
      TextView registerEmailErrorText2 = ViewBindings.findChildViewById(rootView, id);
      if (registerEmailErrorText2 == null) {
        break missingId;
      }

      id = R.id.register_email_label;
      TextView registerEmailLabel = ViewBindings.findChildViewById(rootView, id);
      if (registerEmailLabel == null) {
        break missingId;
      }

      id = R.id.register_email_text;
      EditText registerEmailText = ViewBindings.findChildViewById(rootView, id);
      if (registerEmailText == null) {
        break missingId;
      }

      id = R.id.register_name_error_text;
      TextView registerNameErrorText = ViewBindings.findChildViewById(rootView, id);
      if (registerNameErrorText == null) {
        break missingId;
      }

      id = R.id.register_name_label;
      TextView registerNameLabel = ViewBindings.findChildViewById(rootView, id);
      if (registerNameLabel == null) {
        break missingId;
      }

      id = R.id.register_name_text;
      EditText registerNameText = ViewBindings.findChildViewById(rootView, id);
      if (registerNameText == null) {
        break missingId;
      }

      id = R.id.register_phone_number_error_text;
      TextView registerPhoneNumberErrorText = ViewBindings.findChildViewById(rootView, id);
      if (registerPhoneNumberErrorText == null) {
        break missingId;
      }

      id = R.id.register_phone_number_error_text2;
      TextView registerPhoneNumberErrorText2 = ViewBindings.findChildViewById(rootView, id);
      if (registerPhoneNumberErrorText2 == null) {
        break missingId;
      }

      id = R.id.register_phone_number_label;
      TextView registerPhoneNumberLabel = ViewBindings.findChildViewById(rootView, id);
      if (registerPhoneNumberLabel == null) {
        break missingId;
      }

      id = R.id.register_phone_number_text;
      EditText registerPhoneNumberText = ViewBindings.findChildViewById(rootView, id);
      if (registerPhoneNumberText == null) {
        break missingId;
      }

      id = R.id.register_progress_bar;
      ProgressBar registerProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (registerProgressBar == null) {
        break missingId;
      }

      id = R.id.register_pwd_error_text;
      TextView registerPwdErrorText = ViewBindings.findChildViewById(rootView, id);
      if (registerPwdErrorText == null) {
        break missingId;
      }

      id = R.id.register_pwd_label;
      TextView registerPwdLabel = ViewBindings.findChildViewById(rootView, id);
      if (registerPwdLabel == null) {
        break missingId;
      }

      id = R.id.register_pwd_text;
      EditText registerPwdText = ViewBindings.findChildViewById(rootView, id);
      if (registerPwdText == null) {
        break missingId;
      }

      id = R.id.register_repwd_error_text;
      TextView registerRepwdErrorText = ViewBindings.findChildViewById(rootView, id);
      if (registerRepwdErrorText == null) {
        break missingId;
      }

      id = R.id.register_repwd_label;
      TextView registerRepwdLabel = ViewBindings.findChildViewById(rootView, id);
      if (registerRepwdLabel == null) {
        break missingId;
      }

      id = R.id.register_repwd_text;
      EditText registerRepwdText = ViewBindings.findChildViewById(rootView, id);
      if (registerRepwdText == null) {
        break missingId;
      }

      id = R.id.signup;
      TextView signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      id = R.id.signup_button;
      Button signupButton = ViewBindings.findChildViewById(rootView, id);
      if (signupButton == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, registerEmailErrorText,
          registerEmailErrorText2, registerEmailLabel, registerEmailText, registerNameErrorText,
          registerNameLabel, registerNameText, registerPhoneNumberErrorText,
          registerPhoneNumberErrorText2, registerPhoneNumberLabel, registerPhoneNumberText,
          registerProgressBar, registerPwdErrorText, registerPwdLabel, registerPwdText,
          registerRepwdErrorText, registerRepwdLabel, registerRepwdText, signup, signupButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
