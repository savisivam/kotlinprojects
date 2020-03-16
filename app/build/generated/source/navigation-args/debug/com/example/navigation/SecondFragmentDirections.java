package com.example.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SecondFragmentDirections {
  @NonNull
  public static ActionSecondFragmentToThirdFragment actionSecondFragmentToThirdFragment() {
    return new ActionSecondFragmentToThirdFragment();
  }

  public static class ActionSecondFragmentToThirdFragment implements NavDirections {
    @NonNull
    private String testString = "hello world";

    public ActionSecondFragmentToThirdFragment() {
    }

    @NonNull
    public ActionSecondFragmentToThirdFragment setTestString(@NonNull String testString) {
      if (testString == null) {
        throw new IllegalArgumentException("Argument \"test_string\" is marked as non-null but was passed a null value.");
      }
      this.testString = testString;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putString("test_string", this.testString);
      return __outBundle;
    }

    public int getActionId() {
      return com.example.navigation.R.id.action_secondFragment_to_thirdFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      if (!super.equals(object)) {
          return false;
      }
      ActionSecondFragmentToThirdFragment that = (ActionSecondFragmentToThirdFragment) object;
      if (testString != null ? !testString.equals(that.testString) : that.testString != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + (testString != null ? testString.hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }
  }
}
