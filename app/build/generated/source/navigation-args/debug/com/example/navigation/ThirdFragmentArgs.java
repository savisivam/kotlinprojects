package com.example.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ThirdFragmentArgs {
  @NonNull
  private String testString = "hello world";

  private ThirdFragmentArgs() {
  }

  @NonNull
  public static ThirdFragmentArgs fromBundle(Bundle bundle) {
    ThirdFragmentArgs result = new ThirdFragmentArgs();
    bundle.setClassLoader(ThirdFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("test_string")) {
      result.testString = bundle.getString("test_string");
      if (result.testString == null) {
        throw new IllegalArgumentException("Argument \"test_string\" is marked as non-null but was passed a null value.");
      }
    }
    return result;
  }

  @NonNull
  public String getTestString() {
    return testString;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("test_string", this.testString);
    return __outBundle;
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
    ThirdFragmentArgs that = (ThirdFragmentArgs) object;
    if (testString != null ? !testString.equals(that.testString) : that.testString != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (testString != null ? testString.hashCode() : 0);
    return result;
  }

  public static class Builder {
    @NonNull
    private String testString = "hello world";

    public Builder(ThirdFragmentArgs original) {
      this.testString = original.testString;
    }

    public Builder() {
    }

    @NonNull
    public ThirdFragmentArgs build() {
      ThirdFragmentArgs result = new ThirdFragmentArgs();
      result.testString = this.testString;
      return result;
    }

    @NonNull
    public Builder setTestString(@NonNull String testString) {
      if (testString == null) {
        throw new IllegalArgumentException("Argument \"test_string\" is marked as non-null but was passed a null value.");
      }
      this.testString = testString;
      return this;
    }

    @NonNull
    public String getTestString() {
      return testString;
    }
  }
}
