package com.example.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class ThirdFragmentDirections {
  @NonNull
  public static ThirdFragmentToFirstFragment thirdFragmentToFirstFragment() {
    return new ThirdFragmentToFirstFragment();
  }

  public static class ThirdFragmentToFirstFragment implements NavDirections {
    public ThirdFragmentToFirstFragment() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.example.navigation.R.id.thirdFragment_to_firstFragment;
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
      ThirdFragmentToFirstFragment that = (ThirdFragmentToFirstFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }
  }
}
